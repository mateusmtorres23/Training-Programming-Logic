package main

import ("encoding/json";"fmt";"github.com/google/uuid")

type Users struct {
	Id uuid.UUID 		`json:"id"` 
	Name string  		`json:"name"`
	PasswordHash string	`json:"password_hash"`
	Email string		`json:"email"`
}

func Ex06() {

	user := Users{
		Id: uuid.New(), 
		Name: "Carlos", 
		PasswordHash: "password_hash", 
		Email: "email@email.com"}
	
	jsonUser, err := json.Marshal(user)
	if err != nil {
		fmt.Println("Error serializing: ", err)
		return
	}

	fmt.Println(string(jsonUser))

	var unmarshalUser Users
	err = json.Unmarshal(jsonUser, &unmarshalUser)
	if err != nil {
		fmt.Println("Error deserializing: ", err)
		return
	}

	fmt.Println(unmarshalUser)
}