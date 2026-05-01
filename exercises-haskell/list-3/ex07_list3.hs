import Prelude hiding (merge, mergesort)

merge :: Ord a => [a] -> [a] -> [a]
merge [] [] = []
merge xs [] = xs
merge [] ys = ys
merge (x:xs) (y:ys)
    | x > y = y : merge (x:xs) ys
    | otherwise = x : merge xs (y:ys)

splitHalf :: [a] -> ([a], [a])
splitHalf xs = splitAt (length [xs] `div` 2 ) xs

mergesort ::Ord a => [a] -> [a]
mergesort [] = []
mergesort [x] = [x]
mergesort xs = merge (mergesort (fst (splitHalf xs) )) (mergesort (snd (splitHalf xs)))