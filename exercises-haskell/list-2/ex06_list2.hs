perfects :: Int -> [Int]
perfects n = [x | x <- [1..n], sum [d | d <- [1..x-1], x `mod` d == 0] == x]