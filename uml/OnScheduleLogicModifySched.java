@startuml
rectangle "Modify Schedule" {

	
	
	
	rectangle "Select Schedule" as select
	



	}
rectangle "Show Schedule" as showsched {
	rectangle "Display Schedule Information" as dispsched
	rectangle "Read Schedule Information" as readsched

	
	dispsched - readsched
	}

rectangle "Register Schedule" as regsched {
	rectangle "Input Schedule Information" as inputsched
	rectangle "Confirm" as confirm
	rectangle "Write" as write
	
	inputsched - confirm
	confirm - write
	}
dispsched - select
select - regsched
@enduml