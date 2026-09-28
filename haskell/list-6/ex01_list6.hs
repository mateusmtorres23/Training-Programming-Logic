data Nat = Zero | Suc Nat

addition :: Nat -> Nat -> Nat
addition Zero n = n
addition (Suc m) n = Suc (addition m n)

mult :: Nat -> Nat -> Nat
mult Zero _ = Zero
mult (Suc m) n = addition n (mult m n)