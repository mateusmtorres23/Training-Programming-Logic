data ListInt = Vazia | No Int ListInt

sumList :: ListInt -> Int
sumList Vazia = 0
sumList (No value tail) = value + sumList tail