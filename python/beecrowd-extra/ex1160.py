for _ in range(int(input())):
    ca,cb,g1,g2 = map(float, input().split())
    ca, cb = int(ca), int(cb)
    years = 0
    while ca<=cb:
        ca+= int(ca*(g1/100))
        cb+= int(cb*(g2/100))
        years+= 1
        if years>100:
            print('Mais de 1 seculo.')
            break
    if years<101:
        print(f'{len(years)} anos.')