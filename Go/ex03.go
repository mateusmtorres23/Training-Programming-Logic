package main

import ("fmt"; "strings"; "bufio"; "os")

func Ex03() {
	words := make(map[string]int)
	
	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Type a phrase: ")
	phrase, _ := reader.ReadString('\n')
	phrase = strings.TrimSpace(phrase)

	phrase_split := strings.Split(phrase, " ")

	for _, w := range phrase_split {
		words[w] += 1
	}

	fmt.Println(words)
}