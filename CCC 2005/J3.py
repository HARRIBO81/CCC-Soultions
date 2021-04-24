inputs = []
while True:
    n = input()
    inputs.append(n)
    if n == "SCHOOL":
        break

inputs.reverse()
inputs.remove("SCHOOL")
last = inputs[-1]
inputs = inputs[:-1]
indices = [i for i, x in enumerate(inputs) if x == "R" or x == "L"]
for x in indices:
    if inputs[x] == "R":
        print("Turn LEFT onto " + inputs[x+1] + " street" + ".")

    elif inputs[x] == "L":
        print("Turn RIGHT onto " + inputs[x + 1] + " street" + ".")

if last == "L":
    print("Turn RIGHT into your HOME.")
elif last == "R":
    print("Turn LEFT into your HOME.")
