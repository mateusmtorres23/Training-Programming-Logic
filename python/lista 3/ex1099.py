tests = int(input())
for _ in range(tests):
    x,y = [int(x) for x in input().split()]
    if x < y: x,y = y,x
    
    sum_ = 0
    for i in range(x+1,y):
        sum_ += i if i%2!=0 else 0
    print(sum_)