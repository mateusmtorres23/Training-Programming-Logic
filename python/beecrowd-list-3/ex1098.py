i = 0
while i<=2:
    for j in range(1,4,1):
        if i==0 or i==1 or i>1.9:
            i = int(round(i)); j = int(round(j))
            print(f'I={i} J={j+i}')
        else:
            print(f'I={i:.1f} J={j+i:.1f}')
    i+=0.2