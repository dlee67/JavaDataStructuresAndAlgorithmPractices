var express = require("express");
var path = require("path");
var fs = require("fs");
var apirouter = require("./routes/api_router");
var app = express();

app.use((req, res, next) => {
	console.log("Request IP: " + req.url);
	console.log("Request date: " + new Date());
	next();
});

app.use((req, res, next) => {
	var filePath = path.join(__dirname, "static",  req.url);
	fs.stat(filePath, (err, fileInfo) => {
		if(err){
			next();
			return;
		}
		if(fileInfo.isFile()){
			res.sendFile(filePath);
		}else{
			next();
		}
	});
});

app.listen(3000, () => {
	console.log("App started on port 3000");
});