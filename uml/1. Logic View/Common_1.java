@startuml
left to right direction
skinparam packageStyle rect

rectangle "LDisplayManager" as displayMgr {

}

rectangle "LInputController" as inputcontroller {
	rectangle "EventHandler" as eventhd
	rectangle "LInputSchedule" as inputsched
	rectangle "LInpuReport" as inputreport
	rectangle "LInputPrivacy" as inputcomm
	rectangle "LInputExit" as inputexit
}

displayMgr -> eventhd : clickEvent
eventhd --> inputsched
eventhd --> inputreport
eventhd --> inputcomm
eventhd --> inputexit

@enduml