tilTen x = if tilTen x !! 10
            then tilTen (x + 1)
            else print x
