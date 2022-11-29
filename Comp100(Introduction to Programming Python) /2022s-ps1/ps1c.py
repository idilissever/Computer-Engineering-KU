monthly_salary = float(input('Enter your monthly salary: '))
percentage_save = float(input('Enter the percentage to save, as a decimal: '))
total_cost = float(input('Enter the cost of the dream house: '))
percentage_increase = float(input('Enter monthly interest rate applied to the debt, as a decimal: '))
percentage_salary_increase = float(input('Enter the percentage salary raise, as a decimal: '))
current_debt = total_cost
monthly_payment = monthly_salary*percentage_save
num_months= 0
while current_debt>0:
    current_debt = (current_debt - monthly_payment)
    current_debt += current_debt * percentage_increase
    num_months += 1
    if num_months%6==0:
        monthly_payment += monthly_payment*percentage_salary_increase

print('Number of months:', num_months)
