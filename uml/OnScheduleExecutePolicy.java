@startuml
rectangle "Accept Policy" {
	rectangle "EDisplayPolicy" as view <<process>>

	rectangle "EInputManager" as input <<process>> {
		rectangle "MInputButton" as inputbutton <<module>>
	}
	
	input - view
	view - displaymanager
	}
rectangle "EDisplayManager" as displaymanager <<process>> {
	
}
@enduml