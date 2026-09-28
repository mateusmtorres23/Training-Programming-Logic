s = []
n = 1
for i in range(100):
    value = 1/n
    s.append(value)
    n+=1
print(f'{sum(s):.2f}')