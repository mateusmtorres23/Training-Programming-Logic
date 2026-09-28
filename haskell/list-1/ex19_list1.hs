intersection :: [Int] -> [Int] -> [Int]
intersection l1 l2 = [x | x <- l1, x `elem` l2]