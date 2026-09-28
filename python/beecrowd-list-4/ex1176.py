tests = int(input())
c = 0
c1 = 1
fib = []
for _ in range(61):
    fib.append(c)
    c2 = c1+c
    c = c1
    c1 = c2
for _ in range(tests):
    num = int(input())
    print(f'Fib({num}) = {fib[num]}')