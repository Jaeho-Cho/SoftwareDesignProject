@startuml

rectangle "Modify Schedule" {

	rectangle "ESelectSchedule" as selectsched <<process>> {
		rectangle "MSelect" as selectevent <<module>>
	}
	
	}

rectangle "Show Schedule" {
	rectangle "EDisplaySchedule " as displayschedule <<process>> {
		
	}
	rectangle "EDataRead" as readsched <<process>> {
		rectangle "MDataReadBuffer" as readbuffer <<module>>
		
	}

	readbuffer - databaseclient
	displayschedule - readbuffer
	displaymanager -down- displayschedule 
	}
rectangle "EDisplayManager" as displaymanager <<process>> {
	
}
rectangle "MDatabaseClient" as databaseclient <<process>> {
	
}
database "SQLite" as database {
	
}

rectangle "Register Schedule" {
	rectangle "EDisplayInput " as displayinput <<process>> {
		
	}
	
	rectangle "EInputManager" as inputsched <<process>> {
		rectangle "MInputButton" as inputbutton <<module>>
		rectangle "MInputText" as textbutton <<module>>
	}
	rectangle "EConfirmManager" as confirm <<process>> {
		rectangle "MDialog" as dialog <<module>>
	}
	rectangle "EDataStore" as datastore <<process>> {
		rectangle "MDataWriteBuffer" as writebuffer <<module>>
	}
	
	inputbutton - textbutton
	inputbutton - dialog
	dialog - writebuffer
	writebuffer - databaseclient
	databaseclient - database
	displaymanager - displayinput
	displayinput - inputsched
	}

displaymanager -down- selectevent
inputsched -right- selectevent

@enduml