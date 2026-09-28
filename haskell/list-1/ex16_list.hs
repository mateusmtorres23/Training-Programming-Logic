insertPosiX :: [Int] -> Int -> Int -> [Int]
insertPosiX list a b = take b list ++ [a] ++ drop b list