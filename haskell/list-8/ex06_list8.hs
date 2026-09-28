data Priority = Low | Mid | High deriving (Eq)

instance Ord Priority where
    Low <= Low = True
    Mid <= Mid = True
    High <= High = True
    Low <= Mid = True
    Low <= High = True
    Mid <= High = True
    _ <= _ = False

