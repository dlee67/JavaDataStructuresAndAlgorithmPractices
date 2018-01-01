puts "Starting program"
counter = 0
while counter < 10 do
	say = "My number: " + String(counter) #Ruby's polymorphism isn't like python, where
	puts say							  #Python's polymorphism is quite loose.
	counter += 1						  #Ruby is dynamically/strongly typed, Python is all dynamically typed.
end

#After I comeback, I need to dig about looping because of things like, "unless" and "|someobj|."
#Ruby also has something quite elegant (perhaps, some might argue that this is unnecessary.).

counter = 0
until counter > 10 do
	say = "Until, my number: " + String(counter)
	puts say
	counter += 1
end 

puts("About blocks----------")
# The stack overflow has a good explanation for this,
# https://stackoverflow.com/questions/3545870/in-ruby-what-are-the-vertical-lines
# The variable inside the vertical lines are suppose to be referring the parameters to the block.
# The real value comes from the iterator, but later one that.
1.upto(5) {|x| puts x }

#Just like Ruby has until, it also has unless, which is contrapositive to if.
no = false
unless no
	puts "NO!"
end
#It executes the body of code, if the passed in value is false.