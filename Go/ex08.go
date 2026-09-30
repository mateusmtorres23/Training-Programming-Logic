package main

import ("database/sql";"fmt";"log";_ "github.com/lib/pq")

func Ex08() {

	connStr := "user=Postgres password=password dbname=Postgres sslmode=disable"

	db, err := sql.Open("postgres", connStr)
	if err != nil {
		log.Fatal("Error trying to connect with the db: ", err)
	}
	defer db.Close()

	if err = db.Ping(); err != nil {
		log.Fatal("Error trying to connect with the db: ", err)
	}

	fmt.Println("Connect with success!")
}