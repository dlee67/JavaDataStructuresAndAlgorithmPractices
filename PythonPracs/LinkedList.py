# So, in Python, when a class is trying to have a field, it needs to be invoked by self, it seems like.
# But then again, I wonder why we even need to have self keyword.
# Finally....

class Node():
	def __init__(self, Node, val):
		self.next = Node
		self.value = val

class LinkedList():

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

# So much questions.