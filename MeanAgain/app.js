const express = require("express");
const path = require("path");
const mongoose = require("mongoose");

//It seems like Mongoose doesn't have its documentation
//structured like Java API.
mongoose.connect("mongodb://localhost/nodekb");
let db = mongoose.connection;
db.on('error', (err) => {
	console.log(err);
});

db.once("open", () => {
	console.log("Connected to mongoDB");
});

const app = express();

let Article = require("./models/article.js");

//The line directly below solved the, "pug module not found problem.
app.engine("pug", require("pug").__express);
app.set('views', path.join(__dirname, '/views'));
app.set('view engine', 'pug');

app.get("/", (req, res) => {
	//let articles = [
	//	{
	//		id: 1,
	//		title: "Article One",
	//		author: "Brad Traversy",
	//		body: "This is article one"
	//	},
	//	{
	//		id: 2,
	//		title: "Article Two",
	//		author: "Brad Traversy",
	//		body: "This is article two"
	//	},
	//	{
	//		id: 3,
	//		title: "Article Three",
	//		author: "Brad Traversy",
	//		body: "This is article three"
	//	}
	//];
	Article.find({}, (err, articles) => {
		if (err) throw err;
		res.render("index.pug", {
			title: "Articles",
			articles: articles
		});
	});
});

app.get('/articles/add', (req, res) => {
	res.render("add_article.pug", {
		title:"Add Article"
	});
});

app.listen(8080, () => {
	console.log("Server stuff");	
});