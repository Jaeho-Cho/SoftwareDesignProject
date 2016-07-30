@startuml
left to right direction
rectangle "LExit" as exit {
	rectangle "LViewExit" as viewexit {
		rectangle "LEventListener" as eventlistener
		rectangle "LSystemExit" as systemexit
		
		eventlistener -> systemexit
	}
	rectangle "LInputExit" as inputexit {
		
	}
	eventlistener <- inputexit
}
@enduml