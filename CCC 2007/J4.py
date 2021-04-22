line_one = input()
line_two = input()

no_spaces_one = line_one.replace(" ","")
no_spaces_two = line_two.replace(" ","")


if sorted(no_spaces_one) == sorted(no_spaces_two):
    print("Is an anagram.")
else:
    print("Is not an anagram.")
