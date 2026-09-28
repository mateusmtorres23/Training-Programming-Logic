row = int(input())
op = input()

matrix = [[float(input())for _ in range(12)]for _ in range(12)]

sum_ = sum(matrix[row])
print(sum_) if op=='S' else print(sum_/12)