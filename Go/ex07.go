package main

import ("log";"net/http";"encoding/json";"github.com/google/uuid")

func getUserHandler(w http.ResponseWriter, r *http.Request) {
	if r.Method != http.MethodGet {
		http.Error(w, "Not allowed method", http.StatusMethodNotAllowed)
		return
	}

	user := Users{
		Id: uuid.New(),
		Name: "Carlos",
		PasswordHash: "password",
		Email: "email@email.com",
	}

	w.Header().Set("content-type", "application/json")
	w.WriteHeader(http.StatusOK)

	json.NewEncoder(w).Encode(user)
}

func Ex07() {
	http.HandleFunc("/user", getUserHandler)

	log.Println("Servidor rodando na porta 8080...")

	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		log.Fatal("Error trying to initialize server: ", err)
	}
}