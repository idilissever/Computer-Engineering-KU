#Study Question 1

def reshape(tuple0):
  mult = 1
  lst = list(tuple0)
  for i in lst:
    if lst.index(i) == 0:
      continue
    mult *= i
  return (lst[0], mult)


tuple1 = ((16, 3, 28, 28))
print(reshape(tuple1))
print(reshape((16, 40, 1, 64, 64)))

print('------------------------------')

#Study Question 2



def replace_last(l):
  for i in range(len(l)):
    lst_temp = list(l[i]).copy()
    lst_temp[-1] = lst_temp[0]
    del l[i]
    l.insert(i, lst_temp)
  return l


lst = [(10, 20, 40), (40, 50, 60), (70, 80, 90, 100)]
print(replace_last(lst))

print('------------------------------')

#Study Question 3


books = ["Chem","Physics","Writing","Programming","Math"]

def next_to_read(books):
  read = books.pop(-1)
  return (read, books)

print(next_to_read(books))


print('------------------------------')

#Study Question 4

def merge_lists(l1, l2):
  output = [''] * (len(l1) + len(l2))
  for i in range(len(output)):
    if len(l1) == 0:
      output[i] = l2.pop(0)
    elif len(l2) == 0:
      output[i] = l1.pop(0)
    elif i % 2 == 0:
      output[i] = l1.pop(0)
    elif i % 2 == 1:
      output[i] = l2.pop(0)
  return output


l1 = [1, 3, 5, 7]
l2 = [20, 40, 60, 80, 90, 100, 101]
print(merge_lists(l1, l2))


print('------------------------------')

#Study Question 5

data = [12, 24, 47, 5, 63, 105, 5, 95, 8, 14, 2, 7]
batch_size = 4

def minibatch(lst):
  new_list = [lst[x:x+batch_size] for x in range(0, len(lst), batch_size)]
  return new_list

print(minibatch(data))

print('------------------------------')

#Study Question 5


def is_circular(l1, l2):
  new_list = l1 * 2
  for i in range(len(new_list)):
    if l2 == new_list[i:i + len(l2)]:
      return True
  return False


list1 = [10, 10, 0, 0, 10]
list2 = [10, 10, 10, 0, 0]
list3 = [1, 10, 10, 0, 0]

print(is_circular(list1, list2))
print(is_circular(list1, list3))
print(is_circular(list2, list3))