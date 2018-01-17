//Assuming that I am making a singly linked list.

function NodePrototype(someNode, someVal){
	this.nextNode = someNode;
	this.someVal = someVal;
}

var LinkedList={
	header: null,
	addNode: function(someVal){
		if(this.header == null){
			this.header = new NodePrototype(null, someVal);
		}
		var newNode = new NodePrototype(this.header.nextNode, someVal);
		this.header = newNode;
	}
};