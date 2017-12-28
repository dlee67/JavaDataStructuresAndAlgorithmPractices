# So, in Python, when a class is trying to have a field, it needs to be invoked by self, it seems like.
# But then again, I wonder why we even need to have self keyword.
# Finally....

class Node():
	def __init__(self, Node, val):
		self.next = Node
		self.value = val

class LinkedList():

	ClassVariable = True

	def __init__(self, val):
		self.head = Node(None, val)
		
	def add(self, val):
		temp = Node(self.head, val)
		self.head = temp
		
	def iterate(self):
		temp = self.head
		while temp.next != None:
			print(temp.value)
			temp = temp.next
			if temp.next == None:
				print(temp.value)
			
# the line below counts as a innitiallization of an object?			
instantiationWithoutNew = LinkedList(1)
instantiationWithoutNew.add(2)
instantiationWithoutNew.add(3)
instantiationWithoutNew.add(4)
instantiationWithoutNew.iterate()

# So much questions, better try to answer them today.
# After that, let's try to chip away at machine learning things.

# When a variable, during the innitialization of an object, is invoked with self keyword, it is considered to be an instance variable.
# On the other hand of things, when a variable within a class is not invoked with self, it is considered to be a class variable.
# 
# By the way, self is a convention, it's not really a keyword in python.
# Upon the innitialization of an object, instance is automatically passed to the parameter,
# where the self is that instance.	
# 
# It's blatantly stated that when creating an instance of a class, I should invoke it as if it was a function in "Python in nutshell"
# The differences between the class variable and instance variables are well explained in https://www.youtube.com/watch?v=BJ-VvGyQxho&t=1s
# Internally, seems like Python has an object of class within the memory, so the instances can be copied from it.
#