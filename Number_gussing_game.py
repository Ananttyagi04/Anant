import random

top_of_range = input("Type a number: ")
#r = random.randrange(-5, 11)

if top_of_range.isdigit():
    top_of_range = int(top_of_range)

if top_of_range <= 0:
    print('please type a number larger than 0 next time.')
    quit()

else:
    print('please type a number next time.')
    quit()

random_number = random.randint(0, top_of_rang)
##print("random_number")
guesses = 0

while true:
    guesses += 1
    user_guess = input("Make a guess")
    if user_guess.isdigit():
        user_guess = int(user_guess)
    else:
         print('please type a number next time.')
         continue

    if user_guess == random_number:
     print("you got it!")
     break

else:
    if user_guess > rondam_number:
     print("you were above the number!")
    else:
       print("you were below the number!")

print("you got it in", guesses, "guesses")

