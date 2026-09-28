size = int(input())
arr = [int(x) for x in input().split()]
y = min(arr)
print(f'Menor valor: {y}\nPosicao: {arr.index(y)}')