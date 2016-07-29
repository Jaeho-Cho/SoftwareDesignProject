@startuml
rectangle "Register Schedule" {
	rectangle "Input Schedule Information" as inputsched
	rectangle "Confirm" as confirm
	rectangle "Write" as write
	
	inputsched - confirm
	confirm - write
	write - database
	}
database "SQLite" as database {
	
}
@enduml