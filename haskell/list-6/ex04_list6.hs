data Tree a = Folha a | No (Tree a) (Tree a)

splitHalf :: [a] -> ([a], [a])
splitHalf xs = splitAt (length xs `div` 2) xs

balance :: [a] -> Tree a
balance [a] = Folha a
balance xs = No (balance left) (balance right)
    where
        (left, right) = splitHalf xs