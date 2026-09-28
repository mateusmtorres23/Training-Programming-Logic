data Tree a = Leaf a | Node (Tree a)  (Tree a)

countLf :: Tree a -> Int
countLf (Leaf a) = 1
countLf (Node l r) = countLf l + countLf r

balanced :: Tree a -> Bool
balanced (Leaf t) = True
balanced (Node l r)
    | leafDiff <= 1 = balanced l && balanced r
    | otherwise = False
    where 
        leafDiff = abs (countLf l - countLf r)