fibonacciList :: Int -> [Int]
fibonacciList n = take n fibonacci
    where
        fibonacci = 0 : 1 : zipWith (+) fibonacci  (tail fibonacci)