import Data.List (filter)

dic_10 :: [(Int, String)]
dic_10 =
  [ (0, "zero")
  , (1, "um")
  , (2, "dois")
  , (3, "três")
  , (4, "quatro")
  , (5, "cinco")
  , (6, "seis")
  , (7, "sete")
  , (8, "oito")
  , (9, "nove")
  ]

conversion :: [Int] -> [String]
conversion list = [s | (d, s) <- dic_10, ld <- list, d == ld]