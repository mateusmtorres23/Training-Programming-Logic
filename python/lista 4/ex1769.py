while True:
    try:
        cpf = [int(x) for x in input() if x.isdigit()]
        multi1 = 1
        multi2 = 9
        sum1 = []
        sum2 = []
        for i in range(9):
            digs1 = cpf[i]*multi1
            multi1+=1
            sum1.append(digs1)
        b1 = sum(sum1)%11
        b1 = 0 if b1==10 else b1
        for i in range(9):
            digs2 = cpf[i]*multi2
            multi2-=1
            sum2.append(digs2)
        b2 = sum(sum2)%11
        b2 = 0 if b2==10 else b2
        if b1==cpf[9] and b2==cpf[10]:
            print('CPF valido')
        else:
            print('CPF invalido')
    except EOFError:
        break