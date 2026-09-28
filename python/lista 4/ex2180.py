def is_prime(num):
    for i in range(2,int(num**0.5)+1):
        if num%i==0:
            return False
    return True
num = int(input())
primes = []
while len(primes)<10:
    primes.append(num) if is_prime(num) else None
    num+=1
vel = sum(primes)
time = 60000000//vel
print(f'{vel} km/h\n{time:.0f} h / {time//24:.0f} d')