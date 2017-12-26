class Node
	attr_accessor :val, :next # Creates getters and setters methods. Looking back at this fuctionality, this is pretty sick.		
	def initialize (val, next_node)
		@val = val
		@next = next_node
	end		
end	

class LinkedList
	def initialize (val)
		@head = Node.new(val, nil)
	end

	def add (val)	
		temp = Node.new(val, @head.next)
		@head.next = temp
		print("Head now with: ", @head.val, "\n")
		print("Head's next with: ", @head.next.val, "\n")
	end

	def loopThrough()
		
		iter = @head
		
		# The problem is likely being caused from here.
		while iter != nil do
			print(iter.val)
			iter = iter.next
		end
		
	end
end

SomeLL = LinkedList.new(0)

SomeLL.add(4)
SomeLL.add(3)
SomeLL.add(2)
SomeLL.add(1)
SomeLL.loopThrough()
