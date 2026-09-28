sortedOdds :: [Int] -> [Int]
sortedOdds xs = quicksort $ filter odd xs
    where 
        quicksort :: [Int] -> [Int]
        quicksort [] = []
        quicksort (x:xs) = quicksort smaller ++ [x] ++ bigger
            where
                smaller = [y | y <- xs, y <= x]
                bigger = [y | y <- xs, y > x]
