var MongoClient = require('mongodb').MongoClient;
//The below is one way to connect to the mongodb database.
var url = 'mongodb://127.0.0.1:27017';
var db;

MongoClient.connect(url, (err, db) => {
    if (err) return cb(err);
    console.log("Connected correctly to server");
    console.log(db.listCollections());
	db.collection("foo", (err, colle) => {
		//console.log(colle.find());
	});
	db.close();
});
