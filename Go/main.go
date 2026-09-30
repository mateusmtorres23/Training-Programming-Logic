package main

import ("fmt";"sync")

func main() {
	var escolha int

	fmt.Print("Type the exercise number to run it: ")
	
	fmt.Scanln(&escolha)

	fmt.Println("------------------------------------")
	switch escolha {
		case 1:
			Ex01()
		case 2:
			Ex02()
		case 3:
			Ex03()
		case 4:
			Ex04()
		case 5:
			var wg sync.WaitGroup
			wg.Add(2)

			go func() {
				Ex05()
				wg.Done()
			}()

			go func() {
				Ex05()
				wg.Done()
			}()

			wg.Wait()
		case 6:
			Ex06()
		case 7:
			Ex07()
		case 8:
			Ex08()
	}
}