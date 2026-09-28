def grenal():
    res = []
    while True:
        i, g = map(int, input().split())
        res.append('g' if g > i else 'i' if i > g else 'd')
        if input('Novo grenal (1-sim 2-nao)\n') != '1':
            break
    return res

res = grenal()
i, g, d = res.count('i'), res.count('g'), res.count('d')
print(f'{len(res)} grenais\nInter:{i}\nGremio:{g}\nEmpates:{d}')
if i!=g: print(f'{"Inter" if i > g else "Gremio"} venceu mais')
else: print('Não houve vencedor')