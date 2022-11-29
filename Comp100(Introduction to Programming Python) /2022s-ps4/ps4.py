class Powers:
    all_powers = {'Quick Attack': 10,
                  'Outrage': 20,
                  'Electro Ball': 50,
                  'Bolt Strike': 120,
                  'Smack': 10,
                  'Acrobatics': 40,
                  'Fast Punch': 60,
                  'Extra Sensory': 20,
                  'Rock Tomb': 90}



    def __init__(self):
        self.powers = {}


    def add_power(self, power_name):
        if power_name not in self.powers:
            self.powers[power_name] = self.all_powers[power_name]

    def get_total_damage(self):
        total_damage = 0
        for damage in self.powers.values():
            total_damage += damage
        return total_damage



class Pokemon:
    def __init__(self, name, energy_type, cost, hp, weakness=(None, 1), taken = False):
        self.name = name
        self.energy_type = energy_type
        self.cost = cost
        self.hp = hp
        self.num_wins = 0
        self.weakness = weakness
        self.powers = Powers()
        self.taken = taken


    def add_power(self,power_name):
        self.powers.add_power(power_name)

    def make_attack(self):
        return self.powers.get_total_damage()

    #name
    def get_name(self):
        return self.name
    def set_name(self, new_name):
        self.name = new_name


    #energy type
    def get_energy_type(self):
        return self.energy_type

    def set_energy_type(self, new_energy_type):
        self.energy_type = new_energy_type


    #weakness
    def get_weakness(self):
        return self.weakness

    def set_weakness(self, new_weakness):
        self.weakness = new_weakness


    #hp
    def get_hp(self):
        return self.hp

    def set_hp(self, new_hp):
        self.hp = new_hp

    #powers
    def get_powers(self):
        return self.powers

    #num_wins

    def get_num_wins(self):
        return self.num_wins

    def increase_num_wins(self):
        self.num_wins += 1

    #get_cost

    def get_cost(self):
        return self.cost

    def get_taken(self):
        return self.taken

    def pokemon_is_taken(self):
        self.taken = True



    def receive_damage(self, damage_received):
        self.hp -= damage_received

    def is_healthy(self):
        if self.hp > 0:
            return True
        else:
            return False





    def battle_step(self, opponent_pokemon):
        if self.get_energy_type() == opponent_pokemon.get_weakness()[0]:
            opponent_pokemon.receive_damage(self.make_attack() * opponent_pokemon.get_weakness()[1])
        else:
            opponent_pokemon.receive_damage(self.make_attack())

        if opponent_pokemon.get_energy_type() == self.get_weakness()[0]:
            self.receive_damage(opponent_pokemon.make_attack() * self.get_weakness()[1])
        else:
            self.receive_damage(opponent_pokemon.make_attack())


    def battle(self, opponent_pokemon):
        while self.is_healthy() and opponent_pokemon.is_healthy():
            self.battle_step(opponent_pokemon)
        if self.is_healthy():
            self.increase_num_wins()
        else:
            opponent_pokemon.increase_num_wins()



class EvolvedPokemon(Pokemon):

    def __init__(self, name, energy_type, cost, hp, weakness=(None, 1), damage_booster=0, damage_reducer=0):
        super().__init__(name, energy_type, cost, hp, weakness)
        self.damage_booster = damage_booster
        self.damage_reducer = damage_reducer


    def make_attack(self):
        return super().make_attack() + self.damage_booster

    def receive_damage(self, damage_received):
        self.hp -= (damage_received - self.damage_reducer)


    #damage booster
    def get_damage_booster(self):
        return self.damage_booster

    def set_damage_booster(self, new_damage_booster):
        self.damage_booster = new_damage_booster


    #damage reducer
    def get_damage_reducer(self):
        return self.damage_reducer

    def set_damage_reducer(self, new_damage_reducer):
        self.damage_reducer = new_damage_reducer



class Trainer:
    def __init__(self, name, xp):
        self.name = name
        self.xp = xp
        self.pokemons = []

    def get_name(self):
        return self.name

    def get_xp(self):
        return self.xp

    def get_pokemons(self):
        return self.pokemons


    def add_pokemon(self, applicant_pokemon):
        if not applicant_pokemon.get_taken() and self.get_xp() >= applicant_pokemon.get_cost():
            self.pokemons.insert(-1, applicant_pokemon)
            self.xp -= applicant_pokemon.get_cost()
            applicant_pokemon.pokemon_is_taken()
        elif self.get_xp() < applicant_pokemon.get_cost():
            print(self.get_name(), 'does not have enough xp to get', applicant_pokemon.get_name() + '!', self.get_name(), 'has only', self.get_xp(), 'xp.')

    def are_all_defeated(self):
        for pokemon in self.pokemons:
            if pokemon.is_healthy():
                return False
        return True

    def fight(self, opponent_trainer):
        i=0
        j=0

        while not self.are_all_defeated() and not opponent_trainer.are_all_defeated():
            pokemon1, pokemon2 = self.pokemons[i] , opponent_trainer.pokemons[j]
            pokemon1.battle(pokemon2)
            if not pokemon1.is_healthy():
                self.pokemons.remove(pokemon1)
            if not pokemon2.is_healthy():
                opponent_trainer.pokemons.remove(pokemon2)
        if self.are_all_defeated():
            print(opponent_trainer.get_name(), 'wins the fight!')
        else:
            print(self.get_name(), 'wins the fight!')





if __name__ == '__main__':
    pikachu = Pokemon(name='pikachu', energy_type='Lightning', cost=100, hp=60, weakness=('Fighting', 2))
    pikachu.add_power('Quick Attack')
    pikachu.add_power('Electro Ball')

    raichu = EvolvedPokemon('Raichu', 'Lightning', 800, 90, weakness=('Fighting', 2), damage_booster=30, damage_reducer=0)
    raichu.add_power('Quick Attack')
    raichu.add_power('Electro Ball')

    meloetta = Pokemon('Meloetta', 'Fighting', 100, 80, ('Psychic', 2))
    meloetta.add_power('Smack')
    meloetta.add_power('Acrobatics')

    landorus = EvolvedPokemon('Landorus', 'Fighting', 400, 110, ('Psychic', 2), 20, 20)
    landorus.add_power('Smack')
    landorus.add_power('Acrobatics')

    # create a trainer
    ash = Trainer('Ash', 200)

    # add some pokemon to ash
    ash.add_pokemon(pikachu)
    ash.add_pokemon(raichu)  # Should print "Ash does not have enough xp to get Raichu! Ash has only 100 xp."

    # create another
    gary = Trainer('Gary', 1000)

    # add some pokemon to gary
    gary.add_pokemon(landorus)

    ash.fight(gary)  # Should print "Gary wins the fight!"