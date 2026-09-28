s = [1]
m = 3
n = 2
for _ in range(18):
    value = m/n
    s.append(value)
    m+=2
    n*=2
print(f'{sum(s):.2f}')