data Optional a = None | Data a

filterValues :: [Optional a] -> [a]
filterValues [] = []
filterValues (None : xs) = filterValues xs
filterValues (Data v : xs) = v : filterValues xs