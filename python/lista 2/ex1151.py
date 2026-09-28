num = int(input())

c = 0
c1 = 1
fib = []
for i in range(num):
    fib.append(c)
    c2 = c1+c
    c = c1
    c1 = c2
print(' '.join(f'{num}' for num in fib))