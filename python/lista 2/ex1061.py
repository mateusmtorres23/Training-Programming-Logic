day = int(input().split()[1])
hr,mn,sc = map(int, input().strip().split(' : '))
day_f = int(input().split()[1])
hf,mf,sf = map(int, input().strip().split(' : '))

total = (day*86400) + (hr*3600) + (mn*60) +sc
total_f = (day_f*86400) + (hf*3600) + (mf*60) + sf
event = total_f - total

time = [0,0,0,0]
denominators = [86400,3600,60,1]
for i in range(len(time)):
    time[i] = event//denominators[i]
    event %= denominators[i]
strings = ['dia(s)','hora(s)','minuto(s)','segundo(s)']
for j in range(len(time)):
    print(f'{time[j]} {strings[j]}')