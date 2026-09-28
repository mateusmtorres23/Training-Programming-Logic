myAll :: (a -> Bool) -> [a] -> Bool
myAll f [] = True
myAll f (x:xs)
    | f x = myAll f xs
    | otherwise = False

myAny :: (a -> Bool) -> [a] -> Bool
myAny f [] = False
myAny f (x:xs)
    | f x = True
    | otherwise = myAny f xs

myTakeWhile :: (a -> Bool) -> [a] -> [a]
myTakeWhile f [] = []
myTakeWhile f (x:xs)
    | f x = x : myTakeWhile f xs
    | otherwise = []

myDropWhile :: (a -> Bool) -> [a] -> [a]
myDropWhile f [] = []
myDropWhile f (x:xs)
    | f x = myDropWhile f xs
    | otherwise = x:xs

-- Fazendo com fold agora
myAllfold :: (a -> Bool) -> [a] -> Bool
myAllfold f = foldr (\x acc -> f x && acc) True

myAnyfold :: (a -> Bool) -> [a] -> Bool
myAnyfold f = foldr (\x acc -> f x || acc) False

myTakeWhilefold :: (a -> Bool) -> [a] -> [a]
myTakeWhilefold f = foldr (\x acc -> if f x then x : acc else []) []