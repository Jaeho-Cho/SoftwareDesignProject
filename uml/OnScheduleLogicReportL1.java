@startuml
!pragma horizontalLineBetweenDifferentPackageAllowed
rectangle "Receive Information" {
	rectangle "LCheckLocation" as location
	
	rectangle "LReadData " as read
	rectangle "LCheckTransportation" as transportation
	rectangle "LCalculate" as calculate
	rectangle "LNotifyInformation" as notify
	
	read -left- location
	read -right- transportation
	location -up- calculate
	transportation - calculate
	notify - calculate
	read - database
}
database "SQLite" as database {
	
}

@enduml