data Tree a = Leaf a | Node (Tree a) a (Tree a)

height :: Tree a -> Int
height (Leaf _) = 1
height (Node l _ r) = 1 + max (height l) (height r)  