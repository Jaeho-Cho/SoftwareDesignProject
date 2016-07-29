@startuml

rectangle "Receive Information" {
	rectangle "LReadData" {
		rectangle "LLocationData" as locationdata
		rectangle "LTransportationData" as transportationdata
	
	}
	
	rectangle "LCheckLocation" {
		rectangle "LLocationDataCollection" as locationdatacollection
		rectangle "LLocationValidation" as validationl
	
		locationdatacollection - validationl
	}
	
	rectangle "LCheckTransportation" {
		rectangle "LTransportationDataCollection" as transportationdatacollection
		rectangle "LTransportationValidation" as validationt
	
		transportationdatacollection - validationt
	}
	

	
	rectangle "LCalculate" {
		rectangle "LTimeDifference" as timediff
	
	}
	
	rectangle "LNotifyInformation" {
		rectangle "LDisplayText" as displaytext
		rectangle "LSpeakerOut" as speakerout
		displaytext - speakerout
	
	}
	database "SQLite" as database {
		
	}
	
	locationdata -down- locationdatacollection
	transportationdata -down- transportationdatacollection
	validationl - timediff
	validationt - timediff
	timediff - displaytext
	locationdata -up- database
	transportationdata -up- database
	
	
	
}
@enduml