money = int(input())
print(money)
bills = [(100, 'R$ 100,00'), (50, 'R$ 50,00'), (20, 'R$ 20,00'), 
         (10, 'R$ 10,00'), (5, 'R$ 5,00'), (2, 'R$ 2,00'), (1, 'R$ 1,00')]
for i in bills: 
    num_bills=money//i[0]
    money-=i[0]*num_bills
    print(f'{num_bills} nota(s) de {i[1]}')