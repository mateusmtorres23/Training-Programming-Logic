time = int(input())
hr = time//3600; time-=hr*3600
mnt = time//60; time-=mnt*60
print(f'{hr}:{mnt}:{time}')