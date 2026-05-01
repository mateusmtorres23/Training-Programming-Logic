def selection_sort(arr: list[int]):
    for i in range(len(arr) - 1):
        minimum = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[minimum]:
                minimum = j
        arr[i], arr[minimum] = arr[minimum], arr[i]
    return arr

print(selection_sort([2,1,4,3]))
