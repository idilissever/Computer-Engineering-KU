#Q1

x = int(input('Enter an integer: '))

if x==0:
    print('The number you have entered is zero.')
elif x<0:
    print('The number you have entered is negative.')
else:
    print('The number you have enteredis positive.')

#Q2

x = int(input('Enter an integer: '))

if x%2==0:
    print('The number you have entered is even.')
else:
    print('The number you have entered is odd.')

#Q3

x = int(input('Enter an integer: '))
y = int(input('Enter an integer: '))

if x-y >= 0:
    absolute = False
else:
    absolute = True

if not absolute
    print(x-y)
else:
    print(abs(x-y))

#Q4

a = int(input('Enter an integer: '))
b = int(input('Enter an integer: '))
c = int(input('Enter an integer: '))

if a>b and a>c:
    print('a is greater than both of them')
elif a>b or a>b:
    print('a is greater than at least one of them')

#Q5

a = int(input('Enter an integer: '))
b = int(input('Enter an integer: '))

if a == 10 or b == 10 or a+b == 10:
    print('True!')

#Q6

sentence = 'Comp100_is_fun!'

for char in sentence:
    print(char)

#Q7

sentence = 'Comp100_is_fun!'

for char in sentence:
    if char == '_':
        char = ' '
    print(char)

#Q8

sentence = 'Comp100_is_fun!'
new_string = ''

for char in sentence:
    if char == '_':
        char = ' '
    new_string = new_string + char + ' '

print(new_string)

#Q9

str1 = 'abc'
str2 = '12'

for num in str2:
    for char in str1:
        print(char+num)

#Q10

sum = 0
for num in range (0,101):
    if num%2==1:
        sum +=num
print('Sum is:',sum)

#Q11

counter = 0
current_number = 1
while True:
    if current_number%3 == 0 and current_number%2 == 1:
        counter += 1
    elif counter == 15:
        break
    current_number += 1

print('The counter hit 15!')

#Q12
booo = True
str1 = "Coding is fun! For now."
str2 = ''
i = 0
while booo:
    str2 = str2 + str1[i]
    if str1[i] == '!':
        booo = False
    i += 1
print(str2)

#Q13

str1 = "Coding is fun! For now."
str2 = ''
i = 0
while True:
    str2 = str2 + str1[i]
    if str1[i] == '!':
        break
    i += 1

print(str2)


