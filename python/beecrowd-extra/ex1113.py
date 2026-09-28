while True:
    x, y = [int(x) for x in input().split()]
    if x==y:
        break
    print('Crescente') if x<y else print('Decrescente')
