monthly_salary = float(input('Enter your monthly salary: '))
percentage_save = float(input('Enter the percentage to save, as a decimal: '))
total_cost = float(input('Enter the cost of the dream house: '))
percentage_increase = float(input('Enter monthly interest rate applied to the debt, as a decimal: '))
current_debt = total_cost
num_months = 0

while current_debt > 0:
    current_debt = (current_debt - monthly_salary*percentage_save)
    current_debt += current_debt*percentage_increase
    num_months += 1

print('Number of months:', num_months)
