type Ponto2D = (Double, Double)

distOrigin :: Ponto2D -> Double
distOrigin p = sqrt(fst p^2 + snd p^2)

distOriginPM :: Ponto2D -> Double
distOriginPM (x, y) = sqrt(x^2 + y^2)