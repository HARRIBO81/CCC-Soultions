speed_limit = int(input())
speed_of_car = int(input())

if speed_of_car <= speed_limit:
    print("Congratulations, you are within the speed limit!")

if speed_of_car > speed_limit:

    if speed_of_car - speed_limit >=21 and speed_of_car - speed_limit <= 30:
        print("You are speeding and your fine is $270.")

    elif speed_of_car - speed_limit <= 20:
        print("You are speeding and your fine is $100.")

    elif speed_of_car - speed_limit >= 31:
        print("You are speeding and your fine is $500.")
