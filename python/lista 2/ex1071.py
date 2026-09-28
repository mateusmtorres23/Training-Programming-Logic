x = int(input())
y = int(input())
sum_ = 0
if x<y:
    for i in range(x+1,y):
        if i%2!=0: sum_+=i
elif x>y:
    for i in range(y+1,x):
        if i%2!=0: sum_+=i
elif x==y:
    sum_ = 0
print(sum_)