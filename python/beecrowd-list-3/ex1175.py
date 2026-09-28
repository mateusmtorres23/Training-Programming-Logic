vector = [int(input()) for _ in range(20)]

for i in range (10):
    vector[i],vector[19-i] = vector[19-i],vector[i]

for i in range(20):
    print(f'N[{i}] = {vector[i]}')