@startuml
left to right direction
skinparam packageStyle rect


rectangle ":onSchedule"{
	rectangle "LScheduler" as scheduler {

	}
	rectangle "LReportService" as report {

	}
	rectangle "LDataBuffer" as buffer {
		rectangle "LDataReadBuffer" as r
		rectangle "LDataWriteBuffer" as w
	}
	database "SQLite" as db {
		
	}
	
	r <-- db
	w --> db
	report <- r
	scheduler <- r
	scheduler -> w

}
@enduml