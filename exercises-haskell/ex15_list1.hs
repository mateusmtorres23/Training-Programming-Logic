delPosiN :: [Int] -> Int -> [Int]
delPosiN list n = [x | x <- list, x /= list !! n]