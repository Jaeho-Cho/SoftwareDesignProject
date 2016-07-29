@startuml

rectangle "Receive Information" {

	rectangle "ELocationInfoProvider" as location <<process>> {
		rectangle "MLocationInfoManager " as locationinfo <<module>> {
			rectangle "ELocationDataCollection" as locationdatacollection <<thread>>
			rectangle "ELocationValidation" as validationl <<thread>>
		
			locationdatacollection - validationl
		}
	}
	
	rectangle "EDataRead " as read <<process>> {
	
		rectangle "MDataReadBuffer " as datamanager <<module>> {
			rectangle "ELocationData" as locationdata <<thread>>
			rectangle "ETransportationData" as transportationdata <<thread>>
		}
	}
	rectangle "ETransportationInfoProvider" as transportation <<process>> {
		rectangle "MTransportationInfoManager " as transportinfo <<module>> {
			rectangle "ETransportationDataCollection" as transportationdatacollection <<thread>>
			rectangle "ETransportationValidation" as validationt  <<thread>>
		}
	}
	rectangle "ECalculator" as calculate <<process>> {
		rectangle "MCalculateManager " as calculatemanager <<module>> {
			rectangle "ETimeDifference" as timediff <<thread>>
		}
	}
	
	rectangle "EDisplay" as notify <<process>> {
		rectangle "MDisplayManager " as displaymanager <<module>> {
			rectangle "EDisplayText" as displaytext <<thread>>
			rectangle "ESpeakerOut" as speakerout  <<thread>>
			displaytext - speakerout
		}
	}
	


	locationdata -down- locationdatacollection
	transportationdata -down- transportationdatacollection
	validationl - timediff
	validationt - timediff
	timediff - displaytext
	databaseclient -up- database
	locationdata -up- databaseclient
	transportationdata -up- databaseclient
	
}
rectangle "MDatabaseClient" as databaseclient <<process>> {
	
}
database "SQLite" as database {
	
}
@enduml