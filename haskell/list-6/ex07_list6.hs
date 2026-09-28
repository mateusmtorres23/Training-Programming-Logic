data Expr = Val Int | Op Expr Expr

folde :: (Int -> a) -> (a -> a -> a) -> Expr -> a
folde f g (Val n) = f n
folde f g (Op x y) = g (folde f g x) (folde f g y) 

eval :: Expr -> Int
eval = folde id (+)
