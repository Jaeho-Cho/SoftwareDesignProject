@startuml
rectangle "Finish Report Service" {
	rectangle "Finish"
!pragma horizontalLineBetweenDifferentPackageAllowed
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
	}
Finish -- read

}
rectangle "Input" as input

input - read
@enduml
