multOfN3 :: Int -> Int -> Int -> [Int]
multOfN3 a b c = [x | x <- [a..b], x `mod` c == 0]