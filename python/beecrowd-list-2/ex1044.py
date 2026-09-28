x,y = [int(x) for x in input().split()]
print('Sao Multiplos') if x%y==0 or y%x==0 else print('Nao sao Multiplos')