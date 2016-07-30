@startuml
left to right direction

actor User
actor Network


rectangle "OnSchedule" as OnSchedule {
	rectangle "LScheduler" as scheduler {
		rectangle "LInputSchedule" as inputsched
		rectangle "LConfirm" as confirm
		rectangle "LDataWrite" as write
		
		rectangle "LDisplaySchedule" as dispsched
		rectangle "LDataRead" as readsched
				
		rectangle "LSelectSchedule" as select
		rectangle "LDeleteSchedule" as delete
		
		inputsched -down- confirm
		confirm - write
		write - database
		
		database - readsched
		readsched -left- dispsched
		dispsched -up- select
		select -right- delete
		select -left- inputsched
		

	
	}
	database "SQLite" as database {
		
	}
	rectangle "LReportService" as report {
		rectangle "LCheckLocation" as location
		
		rectangle "LDataRead" as readreport
		rectangle "LCheckTransportation" as transportation
		rectangle "LCalculate" as calculate
		rectangle "LNotifyInformation" as notify
		rectangle "LInputReport" as inputreport
		rectangle "LFinishReport" as finish
		
		database -down- readreport
		readreport -left- transportation
		readreport -right- location
		transportation -down- export
		location -down- export
		location -down- notify
		transportation -down- calculate
		calculate -right- notify
		inputreport -down- finish

		
		
	}
	rectangle "LCommunication" as export {
		
	}
	rectangle "LPrivacy" as privacy {
		rectangle "LPrefRead" as prefread
		rectangle "LViewPrivacy" as viewprivacy

		rectangle "LInputPrivacy" as inputcomm
		rectangle "LPrefWrite" as prefwrite
		
		prefread -down- viewprivacy
		viewprivacy -left- inputcomm
		inputcomm -up- prefwrite
	}
	rectangle "LExit" as exit {
		rectangle "LViewExit" as viewexit
		rectangle "LInputExit" as inputexit
		viewexit - inputexit
	}
	User -down- privacy

	privacy -right- scheduler
	privacy -left- exit

	export - Network

}


@enduml