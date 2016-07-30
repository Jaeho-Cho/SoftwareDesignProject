@startuml
left to right direction
skinparam packageStyle rect
actor User
actor Network


rectangle "OnSchedule" as OnSchedule {
	rectangle "LScheduler" as scheduler
	rectangle "LReportService" as report
	rectangle "LCommunication" as export
	rectangle "LPrivacy" as privacy
	rectangle "LExit" as exit
}
export -left- report
User - privacy
scheduler -down- report

export -right- Network
scheduler - privacy
privacy - exit


@enduml