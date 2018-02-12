const express = require("express");
const path = require("path");
//Parses incoming request bodies.
const bodyParser = require("body-parser");
//Enables us to request API's from different domain name.
const cors = require("cors");
const passport = require("passport");
const mongoose = require("mongoose");
const fs = require('fs');
const config = require('./config/database.js');

//The line directly below enables the connection for Mogoose to MongoDB. 
mongoose.connect(config.database);
mongoose.connection.on('connected', () => {
	console.log("Connected to database: " + config.database);
});
mongoose.connection.on('error', (err) => {
	console.log("Database: " + err);
});

const app = express();
const port = 8080;
const users = require('./routes/users');

app.use(cors());

//Something about static folder.
app.use(express.static(path.join(__dirname, 'public')));
app.use(bodyParser.json()); 
app.use('/users.js', users);

app.get('/', (req, res) => {
	fs.readFile("Saiyan.html", (err, data) => {
		if(err) throw err;
		res.write(data);
		res.end();
	});
});

app.listen(port, () => {
	console.log("Listening on 8080");
});