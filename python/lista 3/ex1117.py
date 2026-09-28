grades = []
while True:
    n = float(input())
    grades.append(n) if 0<=n<=10 else print('nota invalida')
    if len(grades)==2:
        break
print(f'media = {sum(grades)/2}')