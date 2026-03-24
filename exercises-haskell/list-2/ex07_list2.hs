doubleList :: [(Int, Int)]
doubleList = concat [[(1,y) | y <- [3,4]],[(2, y) | y <- [3,4]]]