tripleMe x = x*3

isItNine y = if tripleMe y == 9
               then putStrLn "The resultant is 9."
               else putStrLn "The resultant is not 9."
