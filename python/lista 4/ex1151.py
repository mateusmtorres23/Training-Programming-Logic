reps = int(input())
c = 0
c1 = 1
fib = []
for _ in range (reps):
    fib.append(c)
    c2 = c+c1 
    c = c1
    c1 = c2
print(' '.join(f'{num}'for num in fib))