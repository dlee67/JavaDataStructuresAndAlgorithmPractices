var express = require("express");
var app = express();
var mongoose = require("mongoose");
var pug = require("pug");
var http = require("http");

//mongoose.connect("mongodb://localhost:8080/prac");
//var schema = mongoose.Schema({
//	value: {
//		type: String
//	}
//});

//module.exports = mongoose.model('schma', schema);	

//Why?
//Because app.listen allows the server to listen for port 8080, and that's about it.
//I need make an actual http request for anything to happen on the browser.
app.get("/", (req, res, next) => {
	res.end("Super Saiyan 5");
});
app.listen(8080);

//app.get("/", (req, res) => {
//	res.end("Super Saiyan 5!");
//});

