weight = float(input())
height = float(input())

denomnator = height*height

BMI = weight/denomnator

if BMI < 18.5:
    print("Underweight")
elif BMI >=18.5 and BMI <= 25.0:
    print("Normal weight")
elif BMI > 25:
    print("Overweight")
