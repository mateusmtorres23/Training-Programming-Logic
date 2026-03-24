factorial :: Int -> Int
factorial 1 = 1
factorial a = a * factorial (a-1)

combination :: Int -> Int -> Int
combination n m = factorial m `div` (factorial n * factorial (m - n))