//Assuming that I am making a singly linked list.

function NodePrototype(someNode, someVal){
	this.nextNode = someNode;
	this.someVal = someVal;
}

var LinkedList={
	header: null,
	addNode: function(someVal){
		//console.log("In addNode");
		if(this.header == null){
			this.header = new NodePrototype(null, someVal);
			//console.log("Has header: " + this.header.someVal);
		}
		var newNode = new NodePrototype(this.header.nextNode, someVal);
		this.header.nextNode = newNode;
		//console.log("Has header: " + this.header.someVal);
		//console.log("Header next's: " + this.header.nextNode);
	},
	printNodes: function(someNode){
		var recurNode = someNode;
		if(recurNode.nextNode != null){
			console.log(recurNode.someVal);
			this.printNodes(recurNode.nextNode);
		}
	}
};

LinkedList.addNode(1);
LinkedList.addNode(2);
LinkedList.addNode(3);
LinkedList.addNode(4);
LinkedList.addNode(5);
LinkedList.printNodes(LinkedList.header);
