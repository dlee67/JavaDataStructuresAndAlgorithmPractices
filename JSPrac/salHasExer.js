compareString="abcad"
compareWithString="cbada"
function isPermu(compareThis, compareWith){
	console.log("Compare this now: " + compareThis + "\n");
	console.log("Compare with now: " + compareWith + "\n");
	if(compareThis==''){
		if(compareWith==''){
			return "The sequence of characters are permutable to each other.";
		}
	}
	for(var forCT=0;forCT < compareThis.length; forCT++){
		for(var forCW=0;forCW < compareWith.length; forCW++){
			if(compareThis.charAt(forCT) == compareWith.charAt(forCW)){
				return isPermu(compareThis.replace(compareThis.charAt(forCT), ''), 
						compareWith.replace(compareWith.charAt(forCW), ''));
			}			
		}
	}	
		return "The sequences of characters are not permutable to each other."
}
console.log(isPermu(compareString, compareWithString));