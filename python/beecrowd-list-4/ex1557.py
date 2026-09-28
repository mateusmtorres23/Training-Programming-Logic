while True:
    num = int(input())
    if num==0:
        break
    matrix = [[2**(i + j) for i in range(num)]for j in range(num)]
    just = len(str(matrix[-1][-1]))
    for row in matrix:
        print(' '.join(f'{number:{just}}'for number in row))
    print()