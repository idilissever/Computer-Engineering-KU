class Car:
    def __init__(self, name, year, depot):

        self.name = name
        self.production_year = year
        self.depot_size = depot
        self.tax_coef = 0

    def get_name(self):
        return self.name

    def set_name(self, new_name):
        self.name = new_name

    def get_year(self):
        return self.production_year

    def set_year(self, new_year):
        self.production_year = new_year

    def get_depot(self):
        return self.depot_size

    def calc_age(self):
        return 2022 - self.production_year + 1

    def calc_tax(self):
        Tax = 1000 * Car.calc_age(self) * self.tax_coef
        return Tax

    def set_tax_coef(self, val):
        self.tax_coef = val


class PetrolCar(Car):
    def __init__(self, name, year, depot, fuel_consumption):
        Car.__init__(self, name, year, depot)
        self.fuel_cons_rate = fuel_consumption
        super().set_tax_coef(0.2)

    def __str__(self):
        str1 = str(self.name) + " (Petrol, " + str(self.production_year) + ") " + \
            "- " + str(self.depot_size) + " l, " + \
            str(self.fuel_cons_rate) + " l/100km"
        return str1

    def get_max_distance(self):
        return (self.depot_size * 100) / self.fuel_cons_rate

    def get_fuel_cons(self):
        return self.fuel_cons_rate

    def drive(self, distance, cost=2.097):
        refuel_times = 0
        cost_per_km = (self.fuel_cons_rate * cost) / 100.0
        total_cost = distance * cost_per_km
        if self.get_max_distance() > distance:
            pass
        elif self.get_max_distance() == distance:
            refuel_times = 1
        else:
            refuel_times = distance / self.get_max_distance()
        return int(refuel_times), total_cost


class DieselCar(Car):

    def __init__(self, name, year, depot, fuel_consumption):
        Car.__init__(self, name, year, depot)
        self.fuel_cons_rate = fuel_consumption
        super().set_tax_coef(0.3)

    def __str__(self):
        return str(self.name) + " (Diesel, " + str(self.production_year) + ")" + " - " + str(
            self.depot_size) + " l, " + str(self.fuel_cons_rate) + " l/100km"

    def get_max_distance(self):
        return (self.depot_size * 100) / self.fuel_cons_rate

    def drive(self, distance, cost=2.010):
        refuel_times = 0
        cost_per_km = (self.fuel_cons_rate * cost) / 100.0
        total_cost = distance * cost_per_km
        if self.get_max_distance() > distance:
            pass
        elif self.get_max_distance() == distance:
            refuel_times = 1
        else:
            refuel_times = int(distance / self.get_max_distance())
        return int(refuel_times), total_cost

   


class EV(Car):
    
    def __init__(self, name, year, depot, fuel_consumption):
        Car.__init__(self, name, year, depot)
        self.fuel_cons_rate = fuel_consumption
        super().set_tax_coef(1)

    def __str__(self):
        return str(self.name) + " (EV, " + str(self.production_year) + ")" + " - " + str(self.depot_size) + " kWh, " + str(
            self.fuel_cons_rate) + " kWh/100km"

    def get_max_distance(self):
        return (self.depot_size / self.fuel_cons_rate) * 100

    def get_recharge_times(self, distance):
        if self.get_max_distance() > distance:
            recharge_times = 0
        elif self.get_max_distance() == distance:
            recharge_times = 1
        else:
            recharge_times = distance / self.get_max_distance()
        return recharge_times

    def drive(self, distance, cost=0.357):
        cost_per_km = (self.fuel_cons_rate * cost) / 100.0
        total_cost = distance * cost_per_km

        return int(self.get_recharge_times(distance)), total_cost



def find_most_sustainable(fleet1, fleet2, dist):
    
    s1 = sum([f1.drive(dist)[0] for f1 in fleet1])
    print('Yearly refill of fleet 1:', s1)
    s2 = sum([f2.drive(dist)[0] for f2 in fleet2])
    print('Yearly refill of fleet 2:', s2)
    return s1 < s2

  

def find_cost_effective(fleet1, fleet2, dist):
    
    s1 = sum([f1.drive(dist)[1] for f1 in fleet1])
    print('Yearly cost of fleet 1:', s1, 'EUR')
    s2 = sum([f2.drive(dist)[1] for f2 in fleet2])
    print('Yearly cost of fleet 2:', s2, 'EUR')

    return s1 < s2



if __name__ == "__main__":
    print("== Part I ==")
    c1 = PetrolCar("VW Polo", 2020, 45, 4.7)
    c2 = DieselCar("Renault Clio", 2019, 39, 4.2)
    c3 = EV("Mini Electric", 2021, 32.6, 17.5)
    print(c1)
    print(c2)
    print(c3)

    """
Should print:
VW Polo (Petrol, 2020) - 45 l, 4.7 l/100km
Renault Clio (Diesel, 2019) - 39 l, 4.2 l/100km
Mini Electric (EV, 2021) - 32.6 kwh, 17.5 kWh/100km
"""

    print("== Part II ==")
    rc1, cost1 = c1.drive(2000)
    rc2, cost2 = c2.drive(200)
    rc3, cost3 = c3.drive(2000)
    print("C1 cost: ", cost1, " with ", rc1, " refuels")
    print("C2 cost: ", cost2, " with ", rc2, " refuels")
    print("C3 cost: ", cost3, " with ", rc3, " recharges")

    """
Should print:
C1 cost:  197.118  with  2.0  refuels
C2 cost:  16.884  with  0.0  refuels
C3 cost:  124.94999999999999  with  10.0  recharges
"""

    print("== Part III ===")
    print("Tax for c1: ", c1.calc_tax())
    print("Tax for c2: ", c2.calc_tax())
    print("Tax for c3: ", c3.calc_tax())

    """
Tax for c1:  600.0000000000001
Tax for c2:  1200.0
Tax for c3:  2000.0
"""

    print("== Part IV ===")

    fleet1 = [PetrolCar("Mercedes-Benz A180", 2016, 56, 5.4),
              EV("Tesla Model 3", 2022, 60, 11.70),
              EV("Mini Electric", 2021, 32.6, 17.5)]

    fleet2 = [EV("BMW i3", 2020, 42.2, 14.2),
              DieselCar("Renault Clio", 2019, 39, 4.2),
              PetrolCar("VW Polo", 2020, 45, 4.7)]

    dist = 5000
    print("Most sustainable fleet1 is: ",
          find_most_sustainable(fleet1, fleet2, dist))
    print("Most cost-effective fleet1 is: ",
          find_cost_effective(fleet1, fleet2, dist))

    """
== Part IV ===
Yearly refill of fleet 1: 39.0
Yearly refill of fleet 2: 26.0
Most sustainable fleet1 is:  False
Yearly cost of fleet 1: 5487.410000000001 EUR
Yearly cost of fleet 2: 5968.365 EUR
Most cost-effective fleet1 is:  True
"""
