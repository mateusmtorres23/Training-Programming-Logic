data ListInt = Vazia | No Int ListInt

(>|) :: Int -> ListInt -> ListInt
n >| Vazia = No n Vazia
n >| No m tail = No m (n >| tail)