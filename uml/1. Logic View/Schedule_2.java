@startuml
left to right direction
skinparam packageStyle rect

	rectangle "LScheduler" as scheduler {
		rectangle "LInputSchedule" as inputsched
		rectangle "LConfirm" as confirm
		rectangle "LDataWrite" as write
		rectangle "LDisplaySchedule" as dispsched
		rectangle "LDataRead" as readsched	
		rectangle "LSelectSchedule" as select
		rectangle "LDeleteSchedule" as delete
		

		select - dispsched
		dispsched <-- readsched
		readsched <-- database :schedule_info
		select --> inputsched
		inputsched --> confirm
		confirm --> write
		write -> database :schedule_info
		select --> delete
		delete -> database : schedule_id

	}
	
	database "SQLite" as database {
		
	}
	


@enduml