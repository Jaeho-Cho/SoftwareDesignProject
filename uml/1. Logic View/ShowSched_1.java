@startuml
rectangle "Show Schedule" {
	rectangle "Display Schedule Information" as dispsched
	rectangle "Read Schedule Information" as readsched

	
	dispsched - readsched
	}

database "SQLite" as database {
	
}
readsched - database
@enduml