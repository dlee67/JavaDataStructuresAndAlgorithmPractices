var express = require("express")
var http = require("http")
var path = require("path")

var app = express()

app.use(function(request, response, next) {
	console.log("In comes a request to: " + request.url);
	next();
});

app.use(function(request, response, next) {
	var minute = (new Date()).getMinutes();
	if((minute % 2) == 0){
		next();
		} else {
			response.end("Oof, I died.");
		}
});

app.set("views", path.resolve(__dirname, "views"));
app.set("view engine", "ejs");

app.get("/", function(request, response) {
  response.render("index", {
    message: "Hey everyone! This is my webpage."
  });
});

http.createServer(app).listen(3000);