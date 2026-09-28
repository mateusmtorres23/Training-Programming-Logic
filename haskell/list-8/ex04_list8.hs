data Tree a = Leaf a | Node (Tree a) a (Tree a)

countLeafs :: Tree a -> Int
countLeafs (Leaf _) = 1
countLeafs (Node l _ r) = countLeafs l + countLeafs r  