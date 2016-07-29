@startuml
package "Show Schedule" {
	rectangle "Display Schedule Information" as dispsched
	rectangle "Read Schedule Information" as readsched

	
	dispsched - readsched
	}
@enduml