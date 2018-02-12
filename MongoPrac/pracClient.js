var http = require("http");
var mongo = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/MyBase";
var mongoose = require("mongoose");
//var Db = require("Db").Db;

var myMongo = mongo.connect(url, (err, Db) => {
	if (err) throw err;
	//console.log(Db.admin().listDatabases((err, dbs) => {
	//	console.log(dbs);
	//}));
	console.log(Db.collections);
	Db.close();
});
