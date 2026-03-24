import Data.List (group)
compression :: String -> String
compression s = concat [if length x > 3 then "!" ++ show (length x) ++ [head x] else x | x <- group s]