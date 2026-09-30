package main

import ("database/sql";"fmt";"log";_ "github.com/lib/pq")

type name struct {
	Name string
}

func Ex09() {
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

	fmt.Scan(&event)

	rows, err := db.Query("SELECT user_name FROM vw_user_event_registrations WHERE event_name = $1", event)
	if err != nil {
		log.Fatal("Error while performing the query: ", err)
		return
	}

	defer rows.Close()

	var names []name

	for rows.Next() {
		var n name

		err := rows.Scan(&n.Name)
		if err != nil {
			log.Fatal("Error while reading line: ", err)
		}

		names = append(names, n)
	}

	if err = rows.Err(); err != nil {
		log.Fatal("Error while through iterating the lines: ", err)
	}

	for _, n := range names {
		fmt.Printf("Name: %s\n", n.Name)
	}
}