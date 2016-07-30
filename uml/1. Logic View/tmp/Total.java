@startuml
left to right direction
skinparam packageStyle rect
actor User
actor Network


rectangle "OnSchedule" as OnSchedule {
	rectangle "LDisplayManager" as displayMgr {

	}
	
	rectangle "LInputController" as inputcontroller {
		rectangle "EventHandler" as eventhd
		rectangle "LInputSchedule" as inputsched
		rectangle "LInputReport" as inputreport
		rectangle "LInputPrivacy" as inputcomm
		rectangle "LInputExit" as inputexit
		
		displayMgr --> eventhd : clickEvent
		eventhd --> inputsched
		eventhd --> inputreport
		eventhd --> inputcomm
		eventhd --> inputexit
	}
	
	rectangle "LScheduler" as scheduler {

		rectangle "LConfirm" as confirm
		rectangle "LDataWrite" as write
		rectangle "LDisplaySchedule" as dispsched
		rectangle "LDataRead" as readsched	
		rectangle "LSelectSchedule" as select
		rectangle "LDeleteSchedule" as delete
		

		select - dispsched

		dispsched -- readsched
		readsched -- database

		
		select -- inputsched
		inputsched -- confirm
		confirm -- write
		write - database
		
		select -- delete
		delete - database

	}
	
	database "SQLite" as database {
		
	}
	rectangle "LReportService" as report {
		rectangle "LCheckLocation" as location
		
		rectangle "LReadData" as readreport
		rectangle "LCheckTransportation" as transportation
		rectangle "LCalculate" as calculate
		rectangle "LNotifyInformation" as notify

		rectangle "LFinishReport" as finish
		
		database - readreport
		readreport - transportation
		readreport -- location
		location - calculate
		transportation -- calculate
		calculate -- notify
		inputreport --> finish
	}

	rectangle "LCommunication" as comm {
		
	}
	rectangle "LPrivacy" as privacy {
		rectangle "LViewPrivacy" as viewprivacy
		rectangle "LPrefRead" as prefread

		rectangle "LPrefWrite" as prefwrite
		
		viewprivacy - prefread
		inputcomm --> prefread
		inputcomm - prefwrite
	}
	
	rectangle "LExit" as exit {
		rectangle "LViewExit" as viewexit

		inputexit --> viewexit
	}





}

User -- displayMgr
scheduler - report
Network - comm
report - comm
scheduler -- privacy
privacy -- exit


@enduml