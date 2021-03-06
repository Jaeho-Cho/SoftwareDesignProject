@startuml
rectangle "Show Schedule" as showsched {
	rectangle "Display Schedule Information" as dispsched
	rectangle "Read Schedule Information" as readsched

	
	dispsched - readsched
	}
rectangle "Delete Schedule" {

	

	
	rectangle "Select Schedule" as select
	rectangle "Confirm" as confirm
	rectangle "Delete" as delete
	


	dispsched - select
	select - confirm
	confirm - delete
	delete - database
	}

database "SQLite" as database {
	
}
@enduml