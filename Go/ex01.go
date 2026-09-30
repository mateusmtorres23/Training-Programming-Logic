package main

import ("fmt"; "slices")

func Ex01() {
	var n int
	fmt.Print("Type a number to see its prime factors: ")
	fmt.Scan(&n)

	var factors []int
	current := 2

	for n > 1 {

		if n % current == 0 {
		n /= current

		if slices.Contains(factors, current){
			// Do nothing
		}else {
			factors = append(factors, current)
		}
		
		} else {
			current += 1
		}
	}

	fmt.Println(factors)
}