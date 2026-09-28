grades = [float(x) for x in input().split()] #não faça por list comprehension PLMDS, nn vale a pena
avg = ((grades[0]*2)+(grades[1]*3)+(grades[2]*4)+grades[3])/10
print(f'Media: {avg:.1f}')
if avg>=7: 
    print('Aluno aprovado.')
elif avg<5:
    print('Aluno reprovado.')
elif 5<=avg<7: 
    print('Aluno em exame.')
    exam = float(input())
    print(f'Nota do exame: {exam:.1f}')
    print('Aluno aprovado.') if (exam+avg)/2>=5 else print('Aluno reprovado.')
    print(f'Media final: {(exam+avg)/2:.1f}')