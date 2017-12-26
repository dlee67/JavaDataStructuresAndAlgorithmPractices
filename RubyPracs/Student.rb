class Student

	attr_accessor :GPA, :gender
	
	def initialize (gpa, gen)
		@GPA = gpa
		@gender = gen
	end

end

SomeStudent = Student.new(3.43, "Male")
print("Your GPA: ", SomeStudent.GPA, "\n")
print("Your gender: ", SomeStudent.gender, "\n")