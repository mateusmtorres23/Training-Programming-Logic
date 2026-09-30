package main

import ("fmt")

type User struct {
	name string
	age int
	}

func (u User) IsLegalAge() string {
	if u.age > 17 {
		return "is of legal age"
	}else{
		return "is not of legal age"
	}
}

func Ex04() {
	adult := User{"adult", 30}
	teen := User{"teen", 15}

	fmt.Println(adult.IsLegalAge())
	fmt.Println(teen.IsLegalAge())
}