def avrg():
    while True:
        grade = float(input())
        if 0 <= grade <= 10: return grade
        print('nota invalida')

while True:
    gd1, gd2 = avrg(), avrg()
    print(f'media = {(gd1 + gd2)/2:.2f}')
    while True:
        print('novo calculo (1-sim 2-nao)')
        x = int(input())
        if x in [1, 2]: break
    if x == 2: break