[a,b,c,] = [int(x) for x in input().split()]
gt1 = (a+b+abs(a-b))//2; gt2 = (gt1+c+abs(gt1-c))//2
print(f'{gt2} eh o maior')