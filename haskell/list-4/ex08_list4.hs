list2int :: [Int] -> Int
list2int = foldl (\x y -> 10 * x + y) 0