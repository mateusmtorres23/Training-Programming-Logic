repeatTill1 :: Int -> [Int]
repeatTill1 n = concatMap (\x -> take x (repeat x)) [n, n-1..1]