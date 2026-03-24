grid :: Int -> Int -> [(Int, Int)]
grid a b = [(x, y) | x <- [0..a], y <- [0..b]]

square :: Int -> [(Int, Int)]
square a = [(x, y) | x <- [0..a], y <- [0..a], x /= y]