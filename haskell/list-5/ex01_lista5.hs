data WeekDay = Monday | Tuesday | Wednesday | Thursday | Friday | Saturday | Sunday deriving (Show, Eq)

itsWeekendPM :: WeekDay -> Bool
itsWeekendPM Saturday = True
itsWeekendPM Sunday = True
itsWeekendPM _ = False

itsWeekendCp :: WeekDay -> Bool
itsWeekendCp wd
    | wd == Saturday || wd == Sunday = True
    | otherwise = False