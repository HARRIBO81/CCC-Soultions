a = int(input()) #apples
b = int(input()) #apples
c = int(input()) #apples

d = int(input()) #bannans
e = int(input()) #bannans
f = int(input()) #bannans

new_a = a * 3
new_b = b * 2

new_d = d * 3
new_e = e * 2

sum_a = new_a + new_b + c

sum_b = new_d + new_e + f

if sum_a > sum_b:
    print("A")
elif sum_a < sum_b:
    print("B")
elif sum_a == sum_b:
    print("T")
