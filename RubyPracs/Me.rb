# Unlike Java, inheritance works smoothly if the classes are within the same file,
# where having the class be visible for inheritance in separate file requires an extra work.
# Referred https://ruby-doc.org/core-2.1.1/File.html
# Referred https://ruby-doc.org/core-2.4.2/Kernel.html#method-i-require
require File.expand_path("Student.rb", "./")

class Me < Student

	attr_accessor :ethnicity

	def initialize (gpa, gen, ethn)
		super(gpa, gen)
		@ethnicity = ethn
	end

end

Bob = Me.new(3.43, "Male", "Asian")
print(Bob.GPA, "\n")
print(Bob.ethnicity, "\n")