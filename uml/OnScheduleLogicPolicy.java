@startuml
rectangle "Accept Policy" {
	rectangle "View" as view
	rectangle "Input" as input
	
	input - view
	}
@enduml