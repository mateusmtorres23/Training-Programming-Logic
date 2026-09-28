[a,b,c] = [float(x) for x in input().split()] 
tri=(a*c)/2
cir=3.14159*(c**2)
tra=((a+b)*c)/2
qua=b**2; ret=a*b
print(f'TRIANGULO: {tri:.3f}\nCIRCULO: {cir:.3f}\nTRAPEZIO: {tra:.3f}\nQUADRADO: {qua:.3f}\nRETANGULO: {ret:.3f}')