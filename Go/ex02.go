package main

import "fmt"

func Ex02() {
	unsorted := []int{3,1,5,7,6,2,4}

	for i := range unsorted {
		for j := range unsorted[:len(unsorted)-i-1] {
			if unsorted[j+1] < unsorted[j] {
				unsorted[j], unsorted[j+1] = unsorted[j+1], unsorted[j]
			} 
		}
	}
	fmt.Println(unsorted)
}