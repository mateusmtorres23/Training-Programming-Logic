vector = [int(input())for _ in range(10)]

for i in range(len(vector)):
    vector[i]= 1 if vector[i]<=0 else vector[i]
for i in range(len(vector)):
    print(f'X[{i}] = {vector[i]}')