position :: Int -> [a] -> a
position n xs = snd $ last $ filter (\(i, _) -> i == n) (zip [0..n] xs)