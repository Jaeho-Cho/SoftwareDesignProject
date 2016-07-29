@startuml
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
rectangle "EDisplayManager" as displaymanager <<process>> {
	
}

rectangle "MDatabaseClient" as databaseclient <<process>> {
	
}
database "SQLite" as database {
	
}
@enduml