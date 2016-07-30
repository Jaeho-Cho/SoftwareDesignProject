@startuml
actor User
rectangle "LScheduler" as scheduler {
		
		rectangle "LScheduleEventListener" as schedeventlistener {
			
		}
		
		rectangle "LInputScheduleData" as inputscheddata {
			
		}
	
		
		User -down- touch
		touch -down- inputdata
		touch -down- inputclick
		inputclick -down- schedeventlistener
		inputdata -down- inputscheddata
		inputscheddata -down- writebuffer
		schedeventlistener -down- writebuffer
		writebuffer -down- databaseclient
		databaseclient -down- database
		displaymanager -down- displayschedule
		inputscheddata -left- displayschedule
		readbuffer -down- databaseclient
		displayschedule -down- readbuffer
		schedeventlistener -right- confirm
		inputclick -down- confirm
		confirm -down- writebuffer
		

		rectangle "LConfirm" as confirm {
			
		}
	
		
		rectangle "LDisplaySchedule" as displayschedule {
			
		}					
	
	}

rectangle "LInputManager" as inputmanager {
	rectangle "LInputClick" as inputclick {
		
	}
	rectangle "LInputData" as inputdata {
		
	}
}

rectangle "LTouchDeviceController" as touch {
	
}

rectangle "LDisplayManager" as displaymanager {
	
}

rectangle "LDataBuffer" as databuffer {
	rectangle "LDataReadBuffer" as readbuffer {
		
	}
	rectangle "LDataWriteBuffer" as writebuffer {
		
	}

}
rectangle "LDatabaseClient" as databaseclient {
	
}
database "SQLite" as database {
	
}
@enduml