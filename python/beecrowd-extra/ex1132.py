x,y = int(input()), int(input())
print(sum(i for i in range(min(x,y), max(x,y)+1) if i%13!=0))