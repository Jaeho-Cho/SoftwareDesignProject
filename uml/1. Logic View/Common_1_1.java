@startuml
left to right direction
actor User as u
skinparam packageStyle rect

rectangle "Android Platform" {
rectangle "LTouchDiviceController" as touch {

}
rectangle ":onSchedule" {


rectangle "LInputManager" as inputmgr {
	rectangle "LClickListner" as lister
	rectangle "LEventHandler" as eventhd

}

u --> touch
touch --> lister
eventhd <- lister
rectangle "LScheduler" as s {
}
rectangle "LReportService" as r {
}
rectangle "LPrivacy" as p {
}
rectangle "LExit" as e {
}

eventhd --> s
eventhd --> r
eventhd --> p
eventhd --> e
}
@enduml