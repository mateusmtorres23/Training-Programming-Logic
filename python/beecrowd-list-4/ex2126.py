case = 1
while True:
    try:
        sub = input()
        sequel = input()
        start = 0
        positions = []
        while True:
            ss = sequel.find(sub,start)
            if ss==-1:
                break
            elif ss!=-1:
                start = ss+1
                positions.append(ss+1)
        if len(positions)!=0:
            print(f'Caso #{case}:')
            print(f'Qtd.Subsequencias: {len(positions)}')
            print(f'Pos: {positions[-1]}')
        else:
            print(f'Caso #{case}:')
            print('Nao existe subsequencia')
        case+=1
        print()
    except EOFError:
        break