numbers = []
for _ in range(5):
    num = int(input())
    numbers.append(num)
even = sum(1 for i in numbers if i%2==0)
odd = sum(1 for i in numbers if i%2!=0)
pos = sum(1 for i in numbers if i>0)
neg = sum(1 for i in numbers if i<0)
strings = ['par(es)', 'impar(es)', 'positivo(s)', 'negativo(s)']
digits = [even,odd,pos,neg]
for i in range(len(digits)):
    print(f'{digits[i]} valor(es) {strings[i]}')