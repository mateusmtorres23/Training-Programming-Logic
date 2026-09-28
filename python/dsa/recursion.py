def exp_2(n):
    if n == 0:
        return 1
    return 2 * exp_2(n - 1)

def sum_int(n):
    if n==1:
        return 1
    return n + sum_int(n-1)

def sum_arr(arr: list):
    if len(arr) == 0:
        return 0
    head = arr.pop(0)
    return head + sum_arr(arr)

def factorial(n):
    result = 1
    for i in range(n+1):
        if i == 0:
            continue
        result *= i
    return result