newtype BReal = R Double

newtype Dolar = D  Double

exchangeRealToDolar :: Double -> BReal -> Dolar
exchangeRealToDolar er (R v) = D (v / er)