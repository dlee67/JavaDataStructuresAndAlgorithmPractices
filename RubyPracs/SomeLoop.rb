puts "Starting program"
counter = 0
while counter < 10 do
	say = "My number: " + String(counter) #Ruby's polymorphism isn't like python, where
	puts say							  #Python's polymorphism is quite loose.
	counter += 1						  #Ruby is dynamically/strongly typed, Python is all dynamically typed.
end

#After I comeback, I need to dig about looping because of things like, "unless" and "|someobj|."