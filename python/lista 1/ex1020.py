age = int(input())
year = age//365; age-=year*365
month = age//30; age-=month*30
print(f'{year} ano(s)\n{month} mes(es)\n{age} dia(s)')