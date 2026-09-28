for _ in range(int(input())):
    num = int(input())
    divs = 0
    for i in range(1, num):
        if num%i==0: divs+=i
    print(f'{num} eh perfeito') if divs==num else print(f'{num} nao eh perfeito')
