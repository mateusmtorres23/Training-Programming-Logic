removeMin :: Ord a => [a] -> [a]
removeMin (x:xs)
    | minimum (x:xs) == x = xs
    | otherwise = x : removeMin xs

escolheFuncoes :: [Int -> Bool] -> Int -> [Int -> Bool]
escolheFuncoes [] n = []
escolheFuncoes (x:xs) n
    | x n = escolheFuncoes xs n
    | otherwise = x : escolheFuncoes xs n

combinarCom :: (a -> b -> c) -> [a] -> [b] -> [c]
combinarCom f [] [] = []
combinarCom f (x:xs) (y:ys) = x `f` y : combinarCom f xs ys

difList :: Eq a => [a] -> [a] -> [a]
difList xs ys = [n | n <- xs, n `notElem` ys]