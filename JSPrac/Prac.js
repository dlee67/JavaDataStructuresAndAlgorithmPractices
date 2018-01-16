//C style single line comment.
/*
	C style multi line comment.
*/
process.stdout.write("What the heck, the stdout is just as complicated as the Java's.\n");
console.log("And I have a module different from above that does the samething.");
var stop_point = 10;
var some_list = [1, 2, 3, 4, 5];
//for(var counter=0; counter < stop_point; counter++){
//	console.log("WOW!");
//}
function iter(someList, n){	
	if(someList[n] != null){
		console.log(someList[n]);
		iter(someList.slice(1), 0)
	}
}

iter(some_list, 0);



