data Tree a = Leaf a | Node (Tree a) a (Tree a)

exist :: Ord a => a -> Tree a -> Bool
exist x (Leaf y) = x == y
exist x (Node l v r)
    | compare x v == EQ = True
    | compare x v == LT = exist x l
    | otherwise = exist x r