tests = int(input())
#não precisa definir função fiz só pra treinar
def is_prime(num):
    if num<2:
        return False
    for i in range(2,int(num**0.5)+1):
        if num%i==0:
            return False
    return True

for i in range(tests):
    number = int(input())
    if is_prime(number):
        print(f'{number} eh primo')
    else:
        print(f'{number} nao eh primo')