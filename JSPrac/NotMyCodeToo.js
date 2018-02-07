var http = require('http');
var net = require('net');
var url = require('url');
var proxy = new http.Server();

//Got it from Deploying Node.js, published by packt.
var http = require('http');
var net = require('net');
var url = require('url');
var proxy = new http.Server();

proxy.on('connect', function(request, clientSocket, head) {
  var reqData = url.parse('http://' + request.url);
  var remoteSocket = net.connect(reqData.port, reqData.hostname, function() {
    clientSocket.write('HTTP/1.1 200 \r\n\r\n');
    remoteSocket.write(head);

    // The bi-directional tunnel
    remoteSocket.pipe(clientSocket);
    clientSocket.pipe(remoteSocket);
  });
}).listen(8080, function() {var request = http.request({
    port: 8080,
    hostname: 'localhost',
    method: 'CONNECT',
    path: 'www.google.com:80'
	});
  }).end();