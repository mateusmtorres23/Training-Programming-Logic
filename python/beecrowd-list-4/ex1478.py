while True:
    num = int(input())
    if num==0:
        break
    matrix = [[abs(i - j)+1 for j in range(num)]for i in range(num)]
    for row in matrix:
        print(' '.join(f'{number:3}'for number in row))
    print()