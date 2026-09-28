data ListInt = Vazia | No Int ListInt

(|<) :: Int -> ListInt -> ListInt
n |< list = No n list
