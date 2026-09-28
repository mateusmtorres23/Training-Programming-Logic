def bubble_sort(arr):
    for i in range(len(arr) - 1):
        swap = False
        for i in range(len(arr) - 1 - i):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                swap = True
        if not swap:
            break
    return arr

print(bubble_sort([5,4,2,6]))