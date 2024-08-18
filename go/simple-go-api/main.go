package main

import (
	"encoding/json"
    "fmt"
    "net/http"
)

// Item represents a simple data structure
type Item struct {
	ID    int    `json:"id"`
	Name  string `json:"name"`
	Price int    `json:"price"`
}

// mock data
var items = []Item{
	{ID: 1, Name: "Item One", Price: 100},
	{ID: 2, Name: "Item Two", Price: 200},
	{ID: 3, Name: "Item Three", Price: 300},
}

func main() {
	http.HandleFunc("/items", getItemsHandler)
	port := "8080"
	http.ListenAndServe(":8080", nil)
	fmt.Print("Api is running in port %s ", port)
}

func getItemsHandler(w http.ResponseWriter, r *http.Request) {
	if r.Method == http.MethodGet {
		w.Header().Set("Content-Type", "application/json")
		json.NewEncoder(w).Encode(items)
	} else {
		http.Error(w, "Method not allowed", http.StatusMethodNotAllowed)
	}
}
