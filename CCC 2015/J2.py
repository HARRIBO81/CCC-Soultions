x = input("")
happy_face = ":-)"
sad_face = ":-("

happie_finder = x.count(happy_face)
sad_finder = x.count(sad_face)

if happie_finder == 0 and sad_finder == 0:
    print("none")

elif happie_finder == sad_finder:
    print("unsure")

elif happie_finder > sad_finder:
    print("happy")

elif sad_finder > happie_finder:
    print("sad")
