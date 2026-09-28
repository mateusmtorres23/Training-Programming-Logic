tests = int(input())

for i in range(tests):
    text = input()
    mod_text = ''
    for letter in text:
        mod_text += chr(ord(letter)+3) if letter.isalpha() else letter
    
    inv_text = mod_text[::-1]
    half = len(inv_text) //2
    fin_text = inv_text[:half]
    for letter in inv_text[half:]:
        fin_text += chr(ord(letter)-1)

    print(fin_text)