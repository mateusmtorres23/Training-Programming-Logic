money = float(input())
                                         #float('inf') é infinito em python
numbers = [(400.00,15),(800.00,12),(1200.00,10),(2000.00,7),(float('inf'),4)]
for limit, adjust in numbers:
    if money<=limit:
        new = money+(money*(adjust/100))
        print(f'Novo salario: {new:.2f}\nReajuste ganho: {new-money:.2f}\nEm percentual: {adjust} %')
        break