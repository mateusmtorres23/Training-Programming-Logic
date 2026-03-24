import Data.List (elemIndex)
listGreater :: (Ord a) => [a] -> (a, Maybe Int)
listGreater xs = (maximum xs, elemIndex (maximum xs) xs)