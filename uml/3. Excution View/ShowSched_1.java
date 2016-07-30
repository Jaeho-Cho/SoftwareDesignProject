@startuml
rectangle "Show Schedule" {
	rectangle "EDisplaySchedule " as displayschedule <<process>> {
		
	}
	rectangle "EDataRead" as readsched <<process>> {
		rectangle "MDataReadBuffer" as readbuffer <<module>>
		
	}

	readbuffer - databaseclient
	databaseclient - database
	displayschedule - readbuffer
	displayschedule - displaymanager
	}
rectangle "EDisplayManager" as displaymanager <<process>> {
	
}
rectangle "MDatabaseClient" as databaseclient <<process>> {
	
}
database "SQLite" as database {
	
}
@enduml