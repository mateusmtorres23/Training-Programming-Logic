while True:
    try:
        x1,y1,x2,y2,v,r1,r2 = [int(x) for x in input().split()]
        tr = r1+r2

        dis = (((x1-x2)**2 + (y1-y2)**2)**0.5) + (v*1.5)
        attack = dis-tr<=0

        print('Y') if attack else print('N')
    except EOFError:
        break