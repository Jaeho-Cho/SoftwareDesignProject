@startuml
left to right direction
actor User as u
skinparam packageStyle rect


rectangle "LTouchDiviceController" as touch {

}
rectangle ":onSchedule" {


rectangle "LInputManager" as inputmgr {
	rectangle "LClickListner" as lister
	rectangle "LEventHandler" as eventhd

}

rectangle "LExit"{
	rectangle "LViewExit" as viewexit {
		rectangle "LEventListener" as eventlistener
		rectangle "LSystemExit" as systemexit
		
		eventlistener -> systemexit
	}


u --> touch
touch --> lister
eventhd <- lister
eventhd --> eventlistener
}

rectangle "LDisplayManager" as disp
disp - eventlistener
}
@enduml