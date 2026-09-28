while (num := int(input())) != 0:
    print(sum(i for i in range(num, num+10) if i%2==0))