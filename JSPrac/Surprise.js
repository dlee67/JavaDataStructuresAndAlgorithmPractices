var http = require('http');

function surprise(){
	http.createServer((req, res) => {
		res.end("WAH!");
	});
}

setTimeout(() => 

, 1000);