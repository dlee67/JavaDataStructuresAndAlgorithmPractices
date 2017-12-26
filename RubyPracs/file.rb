SomeArray = [1, 2, 3]

print(SomeArray.length, "\n")
print(SomeArray[0] + SomeArray[1], "\n")

SomeHash = Hash.new
SomeHash[:one] = 1 # In my understanding, that's called explicit form.
print(SomeHash[:one], "\n") # As expected, there should be an integer value one being printed out.

SomeHash = { :one => 1, :two => 2} # This is an implicit form, allows me to create multiple hash values.
print(SomeHash[:one], " ", SomeHash[:two], "\n")

def factorial(x)
	x**x
end

print(factorial(3))
