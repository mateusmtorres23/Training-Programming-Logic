palindrome1 :: Eq a => [a] -> Bool
palindrome1 xs = xs == reverse xs

palindrome2 :: Eq a => [a] -> Bool
palindrome2 [] = True
palindrome2 (x:xs)
    | x == last xs = palindrome2 $ init xs
    | otherwise = False

palindrome3 :: Eq a => [a] -> Bool
palindrome3 xs = and $ zipWith (==) xs (reverse xs)

palindrome4 :: Eq a => [a] -> Bool
palindrome4 xs = all (uncurry (==)) (zip xs (reverse xs)) 