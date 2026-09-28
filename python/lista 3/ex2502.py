while True:
    try:
        c, tests = [int(x) for x in input().split()]
        dic = {}
        key1 =  input().lower()
        key2 = input().lower()
        for ltr in range(len(key1)):
                dic[key2[ltr]] = key1[ltr]
                dic[key1[ltr]] = key2[ltr]
        for _ in range(tests):
            phrase = input()
            result = ''
            for ltr in phrase:
                ltr_low = ltr.lower()
                letter = dic[ltr_low] if ltr_low in dic else ltr
                letter = letter.upper() if ltr.isupper() else letter
                result += letter   
            print(result)
        print()
    except EOFError:
        break