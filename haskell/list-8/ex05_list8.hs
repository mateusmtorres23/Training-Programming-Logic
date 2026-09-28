data Suit = Hearts | Spades | Diamonds | Clubs

instance Eq Suit where
    Hearts == Hearts = True
    Spades == Spades = True
    Diamonds == Diamonds = True
    Clubs == Clubs = True
    _ == _ = False