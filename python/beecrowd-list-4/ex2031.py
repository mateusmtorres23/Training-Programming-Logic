tests = int(input())

for _ in range(tests):
    pl1 = input()
    pl2 = input()

    if pl1=='ataque' and pl2=='pedra': print('Jogador 1 venceu')

    elif pl1=='pedra' and pl2=='papel': print('Jogador 1 venceu')

    elif pl1=='ataque' and pl2=='papel': print('Jogador 1 venceu')

    elif pl1=='papel' and pl2=='papel': print('Ambos venceram')

    elif pl1=='pedra' and pl2=='pedra': print('Sem ganhador')

    elif pl1=='ataque' and pl2=='ataque': print('Aniquilacao mutua')

    else:print('Jogador 2 venceu')