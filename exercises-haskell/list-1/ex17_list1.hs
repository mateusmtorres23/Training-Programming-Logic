index :: [a] -> Int -> a
index list n = head (drop n list)