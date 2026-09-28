[e,p1,p2,t,a] = [int(x) for x in input().split()]

if t==1:
    print('Jogador 1 ganha!') if a==0 else print('Jogador 2 ganha!')
elif t==0 and a==1:
    print('Jogador 1 ganha!')
else:
    sum_ = p1 + p2 
    even = sum_%2==0 

    if even and e==1:
        print('Jogador 1 ganha!')
    elif not even and e==0:
            print('Jogador 1 ganha!')
    else:
        print('Jogador 2 ganha!')