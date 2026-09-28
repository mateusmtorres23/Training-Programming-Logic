row,col = [int(x) for x in input().split()]

matrix = [[int(x) for x in input().split()] for _ in range(row)]
all_seven = False
for i in range(1,row-1):
    for j in range(1, col-1):
        if matrix[i][j]==42:
            if (matrix[i-1][j-1] == 7 and matrix[i-1][j] == 7 and matrix[i-1][j+1] == 7 and matrix[i][j-1] == 7 and 
                matrix[i][j+1] == 7 and matrix[i+1][j-1] == 7 and matrix[i+1][j] == 7 and matrix[i+1][j+1] == 7):
                all_seven = True
                x = i + 1
                y = j + 1
                break
    if all_seven:
        break
if all_seven:
    print(f'{x} {y}')
else:
    print('0 0')