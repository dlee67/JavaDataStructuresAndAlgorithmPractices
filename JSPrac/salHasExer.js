compareString="abc"
compareWithString="cba"
function isPermu(compareThis, compareWith){
	//So, compare if all my characters in the compareWith is in the compareThis list?
	//When a matching characters are found for both of the list, take'em out from
	//both the lists.
	for(var forCT=0;forCT < compareThis.length(); forCT++){
		for(var forCW=0;forCW < compareWith.length(); forCW++){
			if((compareThis.charAt(forCT) && compareWith.charAt(forCW)) == null){
				return true;
			}
			if(compareThis.charAt(forCT) == compareWith.charAt(forCW)){
				isPermu(compareThis.replace(compareThis.charAt(forCt)), 
						compareWith.replace(compareWith.charAt(forCW)));
			}
		}
	}	
}

console.log(isPermu(compareString, compareWithString);