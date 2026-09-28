data TrafficLight = Green | Yellow | Red

nextColor :: TrafficLight -> TrafficLight
nextColor Green = Yellow
nextColor Yellow = Red
nextColor Red = Green
