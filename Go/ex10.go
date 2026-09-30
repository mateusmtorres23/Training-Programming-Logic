package main

import ("database/sql";"fmt";"log";_ "github.com/lib/pq")

func Ex10() {
	connStr := "user=Postgres password=password dbname=Postgres sslmode=disable"

	db, err := sql.Open("postgres", connStr)
	if err != nil {
		log.Fatal("Error trying to connect with the db: ", err)
		return
	}
	defer db.Close()

	if err = db.Ping(); err != nil {
		log.Fatal("Error trying to connect with the db: ", err)
	}

	var event string
	var hours int

	fmt.Print("Which event: ")
	fmt.Scan(&event)
	fmt.Print("how many hours: ")
	fmt.Scan(&hours)

	result, err := db.Exec("CALL prc_generate_batch_certificates($1, $2)", event, hours)
	if err != nil {
		log.Fatal("Error calling procedure: ", err)
	}

	affectedRows, err := result.RowsAffected()
	if err != nil {
		log.Printf("Procedure executed, but it's not possible to see the affected rows: %v\n", err)
	} else {
		fmt.Printf("Procedure executed with success! Affected rows: %d\n", affectedRows)
	}
}