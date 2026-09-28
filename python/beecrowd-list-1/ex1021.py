money = int(round(float(input()) * 100))

bills = [(10000, 'R$ 100.00'), (5000, 'R$ 50.00'), (2000, 'R$ 20.00'), (1000, 'R$ 10.00'), (500, 'R$ 5.00'), (200, 'R$ 2.00')]
coins = [(100, 'R$ 1.00'), (50, 'R$ 0.50'), (25, 'R$ 0.25'), (10, 'R$ 0.10'), (5, 'R$ 0.05'), (1, 'R$ 0.01')]

print('NOTAS:')
for value, label in bills:
    num = money // value
    money -= value * num
    print(f'{num} nota(s) de {label}')
print('MOEDAS:')
for value, label in coins:
    num = money // value
    money -= value * num
    print(f'{num} moeda(s) de {label}')