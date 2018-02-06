//Got it from Deploying Node.js, published by packt.

var http = require("http");
var server = new http.Server();

//As stated in the Node.js documents, http.Server emitts certain events, 
//where we could have a blocks of code fire events according to it.
server.on("connection", (socket) => {
	console.log("Client arrived: " + new Date());
	socket.on("end", () => {
		console.log("Client left: " + new Date());
	});
})
	
server.listen(8080);