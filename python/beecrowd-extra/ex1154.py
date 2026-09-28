avrg = []
while (age:= int(input()))>0:
    if age>0:avrg.append(age)
print(f'{sum(avrg)/len(avrg):.2f}')