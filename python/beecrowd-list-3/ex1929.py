numbers = [int(x) for x in input().split()]
def is_tri(x,y,z):
    return x+y>z and x+z>y and z+y>x

form = None
for i in range(len(numbers)):
    tri = numbers[:i] + numbers[i+1:]
    a,b,c = tri
    if is_tri(a,b,c):
        form = True
        break
print('S') if form else print('N')