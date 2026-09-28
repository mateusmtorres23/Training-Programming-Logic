import Prelude hiding (and, concat, replicate, (!!), elem)
and :: [Bool] -> Bool
and [] = True
and (x:xs) = x && and xs

concat :: [[a]] -> [a]
concat [] = []
concat (x:xs) = x ++ concat xs

replicate :: Int -> a -> [a]
replicate 1 a = [a]
replicate x a = a : replicate (x-1) a

(!!) :: [a] -> Int -> a
(!!) (x:xs) 0 = x
(!!) (x:xs) n = (!!) xs (n-1)

elem :: Eq a => a -> [a] -> Bool
elem a [] = False
elem a (x:xs)
    | a == x = True
    | otherwise = elem a xs 