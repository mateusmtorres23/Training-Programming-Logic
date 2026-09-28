cod1,amt1,price1 = input().split(); cod1, amt1, price1 = int(cod1), int(amt1), float(price1)
cod2,amt2,price2 = input().split(); cod2, amt2, price2 = int(cod2), int(amt2), float(price2)
print(f'VALOR A PAGAR: R$ {(amt1*price1) + (amt2*price2):.2f}')