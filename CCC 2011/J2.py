h = int(input())
m = int(input())
t = 1
a = -6*t**4 + h*t**3 + 2*t**2 + t
while t < m and a > 0:
    t += 1
    a = -6*t**4 + h*t**3 + 2*t**2 + t
if a > 0:
    print("The balloon does not touch ground in the given time.")
else:
    print("The balloon first touches ground at hour:")
    print(t)
