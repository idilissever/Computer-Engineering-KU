def multiply(a_list):

    mult = 1
    for i in range(len(a_list)):
        for j in a_list[i]:
            if isinstance(j, str):
                break
            mult *= j
    return mult




def combine(list_a, list_b):
    letters = []
    numbers = []
    for i in range(len(list_a)):
        for item1 in list_a[i]:
            if isinstance(item1, str):
                letters.append(item1)
            else:
                numbers.append(item1)
    for i in range(len(list_b)):
        for item1 in list_b[i]:
            if isinstance(item1, str):
                letters.append(item1)
            else:
                numbers.append(item1)

    return [letters, numbers]

  
def sum(list_a, list_b):
    letters = []
    numbers = []

    numbers1 = []
    numbers2 = []



    for i in range(len(list_a)):
        for item1 in list_a[i]:
            if isinstance(item1, str):
                letters.append(item1)
            else:
                numbers1.append(item1)

    for i in range(len(list_b)):
        for item1 in list_b[i]:
            if isinstance(item1, str):
                letters.append(item1)
            else:
                numbers2.append(item1)
    for i in range(len(numbers1)):
        numbers.append(numbers1[i]+numbers2[i])


def delete(a_list, var):
    inlist = False
    b_list = a_list.copy()
    for i in range(len(b_list)):
        for j in b_list[i]:
            if var == j:
                inlist = True
                b_list[i].remove(var)
    if not inlist:
        x = 'Variable d is not in the list.'
        return x
    else:
        return b_list


def intersect(list_a, list_b):
    empty_list = []
    for i in range(len(list_a) - 1):
        for j in range(len(list_a[i])):
            if list_a[i][j] == list_b[i][j]:
                empty_list.append(list_a[i][j])

    return empty_list



if __name__ == "__main__":
  # test your code here
  a_list = [['a', 'b', 'c', 'd'], [2, 5, 4, 3]]
  print(multiply(a_list)) # shoul print 120
  
  list_a = [['a', 'b', 'c'], [100, 200, 300]]
  list_b = [['d', 'f'], [300, 200]]
  print(combine(list_a, list_b)) # should print [['a', 'b', 'c', 'd', 'f'], [100, 200, 300, 300, 200]]
  
  list_a = [['a', 'b', 'c',], [100, 200, 300]]
  list_b = [['a', 'b', 'd'], [300, 200, 400]]
  print(sum(list_a, list_b)) # should print [['a', 'b', 'c', 'd'], [400, 400, 300, 400]]
  
  a_list = [['a', 'b', 'c'], [100, 200, 300]]
  print(delete(a_list, 'a')) # should print [['b', 'c'], [200, 300]]
  print(delete(a_list, 'd')) # should print “Variable 'd' is not in the list.“
  
  list_a = [['a', 'b', 'c'], [100, 200, 300]]
  list_b = [['a', 'b', 'd'], [300, 200, 400]]
  print(intersect(list_a, list_b)) # should print ['a', 'b']