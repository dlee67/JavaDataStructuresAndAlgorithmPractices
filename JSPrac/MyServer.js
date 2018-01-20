var http = require('http');
var server = http.createServer((req, res) => {
	res.writeHead(200, {
		'Contend-Type':'text/plain'
	});
	res.end("WOW! MY SERVER!");
});
server.listen(8080, '127.0.0.1');