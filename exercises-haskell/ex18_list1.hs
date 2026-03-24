merge :: [a] -> [a] -> [a]
merge [] l2 = l2
merge (x:xs) l2 = x : merge xs l2 
