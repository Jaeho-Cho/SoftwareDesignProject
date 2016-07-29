@startuml
rectangle "Finish Report Service" {
!pragma horizontalLineBetweenDifferentPackageAllowed
	
rectangle "Input" as input
rectangle "Finish" as finish
input - finish

}
rectangle "Receive Information" as receive {
	rectangle "Check Location" as location
	
	rectangle "Read " as read
	rectangle "Check Transportation" as transportation
	rectangle "Calculate" as calculate
	rectangle "Notify Information" as notify
	
	read -left- location
	read -right- transportation
	location -up- calculate
	notify - location
	transportation - calculate
	notify - calculate
	read - database
}
database "SQLite" as database {
	
}
receive -up- input

@enduml
