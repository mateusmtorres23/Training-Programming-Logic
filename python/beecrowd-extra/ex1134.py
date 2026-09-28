key = [0,0,0]
while (value := int(input())) != 4:
    if value==4:break
    if value in (1,2,3):
        key[value-1]+= 1
print(f'MUITO OBRIGADO\nAlcool: {key[0]}\nGasolina: {key[1]}\nDiesel: {key[2]}')