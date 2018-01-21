var http = require('http');
var fs = require('fs');

//So, while referencing this code, I need to find a way to have Trunks kick that
//Jedi in the face via entering a different URL.
fs.readFile('Trunks.jpg', (err, data) => {
	if (err) throw err;
	http.createServer((req, res) => {
		res.end(data);
	}).listen(8080);
});