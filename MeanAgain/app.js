const express = require("express");
const app = express();
const path = require("path");

//The line directly below solved the, "pug module not found problem.
app.engine("pug", require("pug").__express);
app.set('views', path.join(__dirname, '/views'));
app.set('view engine', 'pug');

app.get("/", (req, res) => {
	let articles = [
		{
			id: 1,
			title: "Article One",
			author: "Brad Traversy",
			body: "This is article one"
		},
		{
			id: 2,
			title: "Article Two",
			author: "Brad Traversy",
			body: "This is article two"
		},
		{
			id: 3,
			title: "Article Three",
			author: "Brad Traversy",
			body: "This is article three"
		}
	];
	res.render("index.pug", {
		title:"hello",
		articles: articles
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