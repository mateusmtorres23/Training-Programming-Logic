
biggerThanAvgCon :: Int -> Int -> Int -> Int
biggerThanAvgCon a b c = isBigger a + isBigger b + isBigger c
    where
        total = a + b + c
        isBigger x = fromEnum (x * 3 > total)


biggerThanAvgLC :: [Int] -> Int
biggerThanAvgLC [a, b, c] = length [x | x <- [a, b, c], x * 3 > a + b + c]