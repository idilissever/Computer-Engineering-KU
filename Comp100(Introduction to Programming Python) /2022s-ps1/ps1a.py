monthly_salary = float(input('Enter your monthly salary: '))
percentage_save = float(input('Enter the percentage to save, as a decimal: '))
total_cost = int(input('Enter the cost of the dream house: '))
current_savings = 0
num_months = 0

while current_savings<total_cost:
    current_savings += monthly_salary*percentage_save
    num_months += 1

print('Number of months:', num_months)
