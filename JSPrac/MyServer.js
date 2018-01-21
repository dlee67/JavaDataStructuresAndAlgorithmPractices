var http = require('http');
var fs = require('fs');

var server = http.createServer((req, res) => {  // The req and res can be learned more aboue here: https://nodejs.org/api/http.html#http_class_http_server
	if(req.url == '/Trunks.jpg'){
		res.writeHead(200, {'Content-Type': 'image/jpeg'});
		fs.readFile('Trunks.jpg', (err, data) => {
			if(err) throw err;
			res.writeHead(200, {
				'Content-Type':'image/jpeg'
			});
			res.end(data); //Whatever I am trying to present, it seems like I have to present them through an end().
						   //and the particular line I am using the end() is critical for my server.
		});
	}	
	res.writeHead(200, {                        //
		'Contend-Type':'text/plain',            // In this particular exercise, I am skipping the statusMessage (which is optional),
		'Date': 'Tue, 15 Nov 1994 08:12:31 GMT',// Headers can be specified however I want, the headers I implement
		'WowIAmCool':'Lulz, so cool.'			// does not need to follow the RFC format.
	});                                         // where the headers are the second arguments.
	//res.end("WOW! MY SERVER!"); I now recognize that the placement of the end is important.
});                                             //
server.listen(8080);				// Pretty much the portion where I host a server on	a 
console.log("I have a port opened in my localhost:8080"); 												
								