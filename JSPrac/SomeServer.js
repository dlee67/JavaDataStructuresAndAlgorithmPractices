var http = require('http'); 
http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/plain'}); //Since I am writing a server, I have to care about that status code, it seems like.
  res.end('Hello World\n'); //This method signals to the server that all of the methods of the server has ended.
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');
