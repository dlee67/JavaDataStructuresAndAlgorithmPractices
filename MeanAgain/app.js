const express = require("express");
const app = express();
const path = require("path");
const mongoose = require("mongoose");

//The line directly below implies that path after the servers are the
//URL for the database I'd like to work on.
mongoose.connect("mongodb://localhost/nodekb");
let db = mongoose.connection;

db.once('open', () => {
	console.log("Connected to MongoDB");
});

db.on('error', (err) => {
	console.log("err");
});

//Mongoose doesn't work, unless I create a schema/model it seems like.
let Article = require("./models/article"); 

//The line directly below solved the, "pug module not found problem.
//Source: https://stackoverflow.com/questions/45342307/error-cannot-find-module-pug
app.engine("pug", require("pug").__express);
app.set('views', path.join(__dirname, '/views'));
app.set('view engine', 'ejs');

//The block of code below fetches the data from the database.
app.get("/", (req, res) => {
	Article.find({}, (err, articles) => {
		if (err) throw err;
		res.render("index.pug", {
			title:"hello",
			articles: articles
		});
	});
});

app.get('/articles/add', (req, res) => {
	res.render("add_article.html", {
		title:"Add Article"
	});
});

app.listen(8080, () => {
	console.log("Server stuff");	
});