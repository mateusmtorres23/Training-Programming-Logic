num = int(input())
value = 0
sequel = []
for _ in range(1000):
    sequel.append(value)
    value += 1
    value = 0 if value==num else value
for i in range(len(sequel)):
    print(f'N[{i}] = {sequel[i]}')