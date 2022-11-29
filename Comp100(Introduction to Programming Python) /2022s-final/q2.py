import time


def find_meals_naive(target_intake, meals):

    target_carb, target_protein = target_intake
    possible_meals = []

    for meal1 in meals:  # O(N)compexity
        for meal2 in meals:  # O(N)compexity
            if meal1[0]+meal2[0] == target_carb and meal1[1]+meal2[1] == target_protein:
                possible_meals.extend([[meal1, meal2]])

    return possible_meals


# comments on complexity: Complexity for this solution is O(n^2) since there has been a use of nested for loops.
# O(n)*O(n) = O(n^2)


def find_meals_smart(target_intake, meals):

    target_carb, target_protein = target_intake

    food_intake = {'protein': target_protein, 'carb': target_carb}
    coun = False
    for meal in meals:
        if not coun:
            food_intake['protein'] -= meal[0]
            food_intake['carb'] -= meal[1]
        elif food_intake['protein'] == meal[0] and food_intake['carb'] == meal[1]:



if __name__ == "__main__":
	meals = [(117, 34), (224, 53), (180, 60), (140, 32), (113, 12), (140, 12), (271, 72), (136, 27), (247, 38), (165, 48), (120, 40),
			(247, 63), (109, 8), (220, 48), (180, 40), (145, 25), (139, 21), (170, 50), (211, 43), (160, 45), (153, 50), (140, 35), (255, 55)]
	target_intake = (360, 80)

	start = time.time()
	pairs1 = find_meals_naive(target_intake, meals)
	end = time.time()
	print(round(end-start, 5), "seconds passed on naive method")
	print(pairs1)

	start = time.time()
	pairs2 = find_meals_smart(...)  
	end = time.time()
	print(round(end-start, 5), "seconds passed on smart method")
	print(pairs2)
