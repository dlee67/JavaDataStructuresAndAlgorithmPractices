var http = require('http');
var fs = require('fs');
var temp;

var picOne = fs.readFile("Trunks.jpg", (err, data) => {
	if(err) throw err;
	temp = data;
	//res.end(); it seems like we need an approach such as this because
	//data argument, in this code segment, is the actual reference to the data
	//I am fetching.
	
	/*
		01/21/18
		And yup, it did work.
		
		https://nodejs.org/api/fs.html#fs_fs_readfile_path_options_callback
		
		It's even directly stated that the raw buffer is returned, "if not encoding is specified"
	*/
});

var server = http.createServer((req, res) => {
	res.end(temp); //My intuition is telling me that this approach won't work because readFile
				     //will return 'utf-8', 'binary', and so on, and they are not an image.
}).listen(8080);