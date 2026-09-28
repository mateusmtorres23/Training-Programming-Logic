while True:
    try:
        num = int(input())
        matrix = [[0 for _ in range(num)] for _ in range(num)]
        l = num//3
        r = num - num//3
        for i in range(len(matrix)):
            for j in range(len(matrix)):
                if i-j==0: matrix[i][j] = 2
                if i+j==num-1: matrix[i][j] = 3
        for i in range(l, r):
            for j in range(l, r):
                matrix[i][j] = 1
        for i in range(len(matrix)):
            for j in range(len(matrix)):
                if i == num//2 and  j==num//2:
                    matrix[i][j] = 4
        
        for row in matrix:
            print(''.join(f'{number}'for number in row))
        print()

    except EOFError:
        break