rows, cols = [int(x) for x in input().split()]
for i in range(1, rows + 1):
    print(i, end='\n' if i % cols == 0 else ' ')