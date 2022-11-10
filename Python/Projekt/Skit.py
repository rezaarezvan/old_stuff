import random

# The number the user is trying to guess
x = int(random.uniform(1, 100))

# The user's guess for the current try
g = 0

# The number of tries taken to guess the number (counter)
numG = 0

while g != x:
    # Take in user's guess and increment counter
    g = int(input('Take a guess (1-100): '))
    numG += 1

    # Check user's guess to tell them higher or lower
    if g > x:
        print('Your guess was too high! Guess lower.')
    elif g < x:
        print('Your guess was too low! Guess higher.')

# Game finished, user found the guess number
print('You finally guessed the number in ' + str(numG) + ' tries.')
