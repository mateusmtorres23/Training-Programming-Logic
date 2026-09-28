import Prelude hiding (sum, length, tail)

sum :: [Int] -> Int
sum [] = 0
sum (x:xs) = x + sum xs

length :: [Int] -> Int
length [] = 0
length (x:xs) = 1 + length xs

tail :: [a] -> a
tail [x] = x
tail (x:xs) =  tail xs