money = float(input())
result = [(2000, 0),(3000, 0.08),(4500, 0.18),(float('inf'), 0.28)]

tax = 0
start_limit = 0
new_money = money
for limit, pct in result:
    if money>start_limit:
        taxes = min(money,limit) - start_limit
        tax+= taxes*pct
        start_limit = limit
    else:
        break
if tax==0: print('Isento')
else: print(f'R$ {tax:.2f}')