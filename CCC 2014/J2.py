vote_count = int(input())
votes = input()

a_vote = votes.count("A")
b_vote = votes.count("B")

if a_vote > b_vote:
    print("A")
elif b_vote > a_vote:
    print("B")
else:
    print("Tie")
