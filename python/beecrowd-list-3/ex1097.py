start = 7
end = 4
for i  in range(1,10,2):
    for j in range(start, end,-1):
        print(f'I={i} J={j}')
    start+=2
    end+=2