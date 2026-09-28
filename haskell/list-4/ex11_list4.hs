myCurry :: ((a, b) -> c) -> (a -> b -> c)  
myCurry f x y = f (x, y)

myUncurryPM :: (a -> b -> c) -> ((a, b) -> c) 
myUncurryPM f (x, y) = f x y

myUncurryUP :: (a -> b -> c) -> ((a, b) -> c)
myUncurryUP f p = f (fst p) (snd p)