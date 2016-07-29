@startuml
rectangle "Enable Text To Speech" {
	rectangle "View" as view
	rectangle "Read" as read
	rectangle "Input" as input
	rectangle "Write" as write
	
	read - view
	view - input 
	input - write
	}
rectangle "Preference" as pref {
}
pref - read

@enduml