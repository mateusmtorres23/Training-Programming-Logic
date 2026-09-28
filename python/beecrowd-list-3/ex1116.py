tests = int(input())
for _ in range(tests):
    x,y = [int(x) for x in input().split()]
    print(f'{x/y:.1f}') if y!=0 else print('divisao impossivel')