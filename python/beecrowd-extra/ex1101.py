while True:
    m,n = [int(x) for x in input().split()]
    if m<1 or n<1:break
    if m>n: m,n = n,m
    numbers = []
    for i in range(m,n+1):
        numbers.append(i)
    print(' '.join(f'{num}'for num in numbers), f'Sum={sum(numbers)}')