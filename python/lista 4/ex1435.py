while True:
    num = int(input())
    if num==0:
        break
    matrix = [[0 for _ in range(num)]for _ in range(num)]
    
    start = 0
    end = num-1
    layer = 1
    while start<=end:
        for i in range(start, end+1):
            for j in range(start, end+1):
                matrix[start][j] = layer
                matrix[end][j] = layer
                matrix[i][start] = layer
                matrix[i][end] = layer
        end-=1
        start+=1
        layer+=1
    for row in matrix:
        print(' '.join(f'{number:3}'for number in row))
    print()