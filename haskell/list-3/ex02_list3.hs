somar :: Int -> Int
somar 0 = 0
somar x = x + somar (x - 1)