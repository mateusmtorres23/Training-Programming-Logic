for _ in range(int(input())):
    x,y = [int(x) for x in input().split()]
    print(sum(i for i in range(x, x+(y*2)) if i%2!=0))