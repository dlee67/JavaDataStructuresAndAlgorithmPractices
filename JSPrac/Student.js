var student={
	GPA: 3.0,
	setGPA: function(value){
		this.GPA = value; //It seems like without the this keyword, the properties aren't
						  //mutable.
	} 
};

console.log(student.GPA);
student.setGPA(3.5);
console.log(student.GPA);
