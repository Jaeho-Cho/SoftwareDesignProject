@startuml
left to right direction
skinparam packageStyle rect
actor User
actor Network


rectangle "OnSchedule" as OnSchedule {
	rectangle "LScheduler" as scheduler
	rectangle "LReportService" as report
	rectangle "LCommunication" as comm
	rectangle "LPrivacy" as privacy
	rectangle "LExit" as exit
}
comm - report
User - scheduler
report - scheduler

comm - Network
scheduler - privacy
privacy - exit


@enduml