class Car():
    def __init__(self, name, year, manufacturer, colour, engine):
        self.name = name
        self.year = year
        self.colour = colour
        self._manufacturer = None
        self._engine = None

        @property
        def engine(self):
            return self._engine

        @engine.setter
        def engine(self, value):
            self._engine = value

        @property
        def manufacturer(self):
            return self._manufacturer

        @manufacturer.setter
        def manufacturer(self, value):
            self._manufacturer = value
    
    def show_manufacturer(self):
        print(f"name: {self.manufacturer.name}")
        print(f"country: {self.manufacturer.country}")

    def show_engine(self):
        print(f"name: {self.engine.name}")
        print(f"engine type: {self.engine.engine_type}")
        print(f"horse power: {self.engine.hp}")

class Engine():
    def __init__(self, name, engine_type, hp,):
        self.name = name
        self.engine_type = engine_type
        self.hp = hp

class Manufacturer():
    def __init__(self, name, country):
        self.name = name
        self.country = country

ferrari = Manufacturer("Ferrari", "Italy")

hy_kers_eng = Engine("HY KERS", "naturally aspirated", 963)

laferrari = Car("LaFerrari", 2013, ferrari, "red", hy_kers_eng)

# print(laferrari.manufacturer.name)
# print(laferrari.engine.name)

laferrari.show_manufacturer()
print()
laferrari.show_engine()