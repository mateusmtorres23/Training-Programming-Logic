tests = int(input())
kinds = {'C': 0, 'R': 0, 'S': 0}
for _ in range(tests):
    num, kind = input().split()
    num = int(num)
    if kind in kinds: kinds[kind] += num
total = sum(kinds.values())
print(f'Total: {total} cobaias')
print(f'Total de coelhos: {kinds["C"]}\nTotal de ratos: {kinds["R"]}\nTotal de sapos: {kinds["S"]}')
print(f'Percentual de coelhos: {kinds["C"]*100/total:.2f} %')
print(f'Percentual de ratos: {kinds["R"]*100/total:.2f} %')
print(f'Percentual de sapos: {kinds["S"]*100/total:.2f} %')