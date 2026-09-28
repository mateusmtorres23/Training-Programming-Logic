num = int(input())
v = []
for _ in range(10):
    v.append(num)
    num*=2
for i in range(len(v)):
    print(f'N[{i}] = {v[i]}')