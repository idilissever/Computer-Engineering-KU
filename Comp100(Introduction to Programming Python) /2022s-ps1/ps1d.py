monthly_salary1 = float(input('Enter your monthly salary: '))
total_cost = float(input('Enter the cost of the dream house: '))
percentage_increase = float(input('Enter monthly interest rate applied to the debt, as a decimal: '))
percentage_salary_increase = float(input('Enter the percentage salary raise, as a decimal: '))

money_paid = 0.0
epsilon = 1000.0

low = 0.0
high = 10000.0

remaining_debt = total_cost
bisect_steps = 0

while True:
    money_paid = 0.0        # reset for new iteration
    monthly_salary = monthly_salary1      # reset for new iteration
    remaining_debt = total_cost        # reset for new iteration
    monthly_saving_guess = (low + high) / 2
    saving_rate = monthly_saving_guess / 10000
    for month in range(1, 49):
        if month % 6 == 1 and month != 1:
            monthly_salary += monthly_salary * percentage_salary_increase
        money_paid = monthly_salary * saving_rate
        remaining_debt -= money_paid
        remaining_debt += remaining_debt * percentage_increase
    if high - low <= 1:
        print('It is not possible to buy the house in four years')
        break
    elif abs(remaining_debt) <= epsilon:
        print('Best savings rate:', round(saving_rate, 3))
        print('Steps in bisection search:', bisect_steps)
        break
    elif remaining_debt > epsilon:
        low = monthly_saving_guess
    elif remaining_debt < -epsilon:
        high = monthly_saving_guess
    bisect_steps += 1

