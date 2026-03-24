mod2Div :: Int -> Int -> Int
mod2Div a b = a - ((a `div` b) * b)

mod2 :: Int -> Int -> Int
mod2 a b
    | a < b = a 
    | otherwise = mod2 (a - b) b