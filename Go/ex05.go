package main

import ("fmt"; "time")

func Ex05() {
	for i := range 5 {
		fmt.Println(i)
		time.Sleep(1 * time.Second)
	}
}