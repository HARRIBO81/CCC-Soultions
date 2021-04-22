student_answer = []
correct_answer = []

student_answer_numbers = []
correct_answer_numbers = []


counter = 0

n = int(input())
for x in range(n):
    student_answer.append(input())
for y in range(n):
    correct_answer.append(input())

for n, i in enumerate(student_answer):
   if i == "A":
        student_answer[n] = 1

for n, i in enumerate(student_answer):
   if i == "B":
        student_answer[n] = 2

for n, i in enumerate(student_answer):
   if i == "C":
        student_answer[n] = 3

for n, i in enumerate(student_answer):
   if i == "D":
        student_answer[n] = 4

for n, i in enumerate(student_answer):
   if i == "E":
        student_answer[n] = 5




for n, i in enumerate(correct_answer):
   if i == "A":
        correct_answer[n] = 1

for n, i in enumerate(correct_answer):
   if i == "B":
        correct_answer[n] = 2

for n, i in enumerate(correct_answer):
   if i == "C":
        correct_answer[n] = 3

for n, i in enumerate(correct_answer):
   if i == "D":
        correct_answer[n] = 4

for n, i in enumerate(correct_answer):
   if i == "E":
        correct_answer[n] = 5


dif = [a_i - b_i for a_i, b_i in zip(student_answer, correct_answer)]

for numbers in dif:
    if numbers == 0:
        counter += 1
print(counter)
