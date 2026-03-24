import Data.List (group)
import Data.Char (digitToInt)
decompression :: String -> String
decompression [] = []
decompression ('!':n:a:xs) = replicate (digitToInt n) a ++ decompression xs
decompression (x:xs) = x : decompression xs