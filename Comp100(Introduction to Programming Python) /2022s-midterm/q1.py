
def check_password(pw):

    bool0 = True
    count = 0
    special_chars = [',', '!', '@', '#', '?', '.']

    for item in special_chars:
        if item in pw:
            count += 1

    if count == 0:
        print('No special chars found in the target password.')
        bool0 = False

    if len(pw) > 15:
        print('The password should contain at most 15 characters.')
        bool0 = False
    elif len(pw) < 8:
        print('The password should contain at least 8 characters.')
        bool0 = False

    for i in range(len(pw)-1):
        if pw[i] == pw[i+1]:
            print('The password has consecutive numbers!')
            bool0 = False

    for i in range(len(pw) - 2):
        try:
            if pw[i].isdigit() and pw[i + 1].isdigit() and pw[i + 2].isdigit:
                if int(pw[i]) + 1 == int(pw[i + 1]) and int(pw[i + 1]) + 1 == int(pw[i + 2]) or int(pw[i]) == int(pw[i + 1]) + 1 and int(pw[i + 1]) == int(pw[i + 2]) +1:
                    print('The password has consecutive numbers!')
                    bool0 = False
        except:
            pass

    no_upper_case = True
    for char in pw[1:-1]:
        if char.isupper():
            no_upper_case = False
            break
    if no_upper_case:
        print('No upper chars found in the target password.')
        bool0 = False

    return bool0


if __name__ == "__main__":


    print("---- 1 ----")
    pw_1 = "a123fgd!"
    print("Result:", check_password(pw_1))
    print("---- 2 ----")
    pw_2 = "321!"
    print("Result:", check_password(pw_2))
    print("---- 3 ----")
    pw_3 = "Abc1xvauna"
    print("Result:", check_password(pw_3))
    print("---- 4 ----")
    pw_4 = "abc1xVauna."
    print("Result:", check_password(pw_4))

"""
  Should print:
  ---- 1 ----
  The password has consecutive numbers!
  No upper chars found in the target password.
  Result: False
  ---- 2 ----
  The password should contain at least 8 characters.
  The password has consecutive numbers!
  No upper chars found in the target password.
  Result: False
  ---- 3 ----
  No special chars found in the target password.
  No upper chars found in the target password.
  Result: False
  ---- 4 ----
  Result: True
"""



