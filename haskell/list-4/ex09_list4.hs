unfold :: (t -> Bool) -> (t -> a) -> (t -> t) -> t -> [a]
unfold p h t x 
       | p x = []
       | otherwise = h x : unfold p h t (t x)

myMap :: (a -> b) -> [a] -> [b]
myMap f = unfold null (f . head) tail

myIterate :: (a -> a) -> a -> [a] 
myIterate = unfold (const False) id 