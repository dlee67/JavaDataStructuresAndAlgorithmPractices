var http = require('http');
var server = http.createServer((req, res) => {  //  
	res.writeHead(200, {                        //
		'Contend-Type':'text/plain'             // In this particular exercise, I am skipping the statusMessage (which is optional),
	});                                         // where the headers are the second arguments.
	res.end("WOW! MY SERVER!");                 //
});                                             //
server.listen(8080);				// Pretty much the portion where I host a server on	a 
												// IP 127.0.0.1: with the port 8080.
console.log("I have a port opened in my localhost:8080"); 												
								