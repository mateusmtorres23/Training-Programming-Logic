srqtSixSeq :: Int -> Double
srqtSixSeq 1 = sqrt  6 
srqtSixSeq a = sqrt(6 + srqtSixSeq a-1)