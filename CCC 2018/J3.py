numbers = input()
numbers = numbers.split(" ")
numbers = [int(i) for i in numbers]
base_0 = numbers[0]
base_1 = numbers[0]+numbers[1]
base_2 = numbers[0]+numbers[1]+numbers[2]
base_3 = numbers[0]+numbers[1]+numbers[2]+numbers[3]

print(abs(base_0-base_0),abs(base_0),abs(base_1),abs(base_2),abs(base_3))
print(abs(base_0),abs(base_0-base_0),abs(base_1-base_0),abs(base_2-base_0),abs(base_3-base_0))
print(abs(base_1), abs(base_0-base_1), abs(base_1-base_1),abs(base_2-base_1),abs(base_3-base_1))
print(abs(base_2), abs(base_0-base_2),abs(base_1-base_2),abs(base_2-base_2),abs(base_3-base_2))
print(abs(base_3),abs(base_0-base_3),abs(base_1-base_3),abs(base_2-base_3),abs(base_3-base_3))
