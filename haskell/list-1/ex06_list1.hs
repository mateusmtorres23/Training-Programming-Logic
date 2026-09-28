xGreater :: Double -> Double -> Double -> Double
xGreater a b c = if a > 0 then (-b + sqrt (b^2 - 4*a*c)) / (2*a) else (-b - sqrt (b^2 - 4*a*c)) / (2*a)

xLesser :: Double -> Double -> Double -> Double
xLesser a b c = if a > 0 then (-b - sqrt (b^2 - 4*a*c)) / (2*a) else (-b + sqrt (b^2 - 4*a*c)) / (2*a)