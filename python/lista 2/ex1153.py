fac = int(input())
total = fac
for i in range(fac-1):
    fac-=1
    total*=fac
print(total)