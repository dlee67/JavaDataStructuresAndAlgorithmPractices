var express = require("express");
var app = express();
var mongoose = require("mongoose");
var pug = require("pug");
var http = require("http");

//So, now is the time to figure out what's going on with this code.
//Sauce: https://www.w3schools.com/nodejs/nodejs_mongodb_find.asp
var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/PracAgain";
MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  var dbo = db;
  dbo.collection("Lulz").find({}).toArray(function(err, result) {
    if (err) throw err;
    console.log(result);
    db.close();
  });
});