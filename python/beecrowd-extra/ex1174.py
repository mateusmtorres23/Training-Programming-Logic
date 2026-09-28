arr = [float(input()) for _ in range(100)]
[print(f'A[{i}] = {v:.1f}') for i, v in enumerate(arr) if v <= 10]