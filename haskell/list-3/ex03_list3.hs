import Prelude hiding ((^))
(^) :: (Num a, Eq a) => a -> a -> a
m ^ 0 = 1
m ^ n = m * (m ^ (n - 1))