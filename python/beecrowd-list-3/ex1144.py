num = int(input())
nat = 1
for _ in range(num):
    print(f'{nat} {nat**2} {nat**3}')
    print(f'{nat} {(nat**2)+1} {(nat**3)+1}')
    nat+=1