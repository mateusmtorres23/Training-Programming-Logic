exclOr :: Bool -> Bool -> Bool
exclOr a b = (a || b) && not (a && b)