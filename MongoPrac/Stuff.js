var MongoClient = require('mongodb').MongoClient;
//The below is one way to connect to the mongodb database.
var url = 'mongodb://127.0.0.1:27017';
var db;

var album = { _id: "112",

              name: "italy2012",

              title: "Spring Festival in Italy",

              date: "2012/02/15",

              description: "I went to Italy for Spring Festival." };

//Appearantly, this creates the collection,
MongoClient.connect(url, (err, db) => {
    if (err) throw err;
	//Where the name of the collection, in this is "albums"
    db.collection("albums", (err, aa) =>{
		if (err) throw err;
		aa.insertOne(album, (err, inserted_doc) => {
			if(err) throw err;
			console.log(inserted_doc);
		});
	});
	db.close();
});

