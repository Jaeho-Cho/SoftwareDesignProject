@startuml
package "Enable Text To Speech" {
	rectangle "View" as view
	rectangle "Input" as input
	rectangle "Write" as write
	
	view - input 
	input - write
	}
@enduml