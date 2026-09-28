data Season = Summer | Winter | Autumn | Spring deriving (Show)

data Climate = Rainy | Temperate Float deriving (Show)

adjustClimate :: Season -> Climate
adjustClimate Summer = Temperate 35.0
adjustClimate Spring = Temperate 25.0
adjustClimate Winter = Rainy
adjustClimate Autumn = Rainy
