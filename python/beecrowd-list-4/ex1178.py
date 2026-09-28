num = float(input())
halfs = []
for i in range(100):
    halfs.append(num)
    num/=2
for i in range(len(halfs)):
    print(f'N[{i}] = {halfs[i]:.4f}')