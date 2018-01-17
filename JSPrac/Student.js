var student={
	GPA: 3.0,
	setGPA: function(value){
		this.GPA = value;
	} 
};

console.log(student.GPA);
student.setGPA(3.5);
console.log(student.GPA);
