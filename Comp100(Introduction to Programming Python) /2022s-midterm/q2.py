

def bounce(step_size, fraction):
   

    # base case
    if step_size < 0.1: #1 mm
        return 0
    # recursive step

    else:
        return step_size + bounce(float(step_size) * fraction, fraction )


if __name__ == "__main__":
  print("Total horizontal displacement", bounce(5, 0.5)) # should print 9.84375