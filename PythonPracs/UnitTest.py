import unittest 

class SomeTests(unittest.TestCase):
	
	def test_wow(self):
		self.assertEqual(1, 1)

if __name__ == '__main__':
	unittest.main()