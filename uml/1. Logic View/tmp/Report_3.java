@startuml

rectangle "LReportService" as report {
	rectangle "LReadData" as readreport {
		rectangle "LLocationData" as locationdata
		rectangle "LTransportationData" as transportationdata
	}
	
		rectangle "LCheckLocation" as location {
			rectangle "LLocationDataCollection" as locationdatacollection
			rectangle "LLocationValidation" as validationl
		
			locationdatacollection - validationl
		}
		

		rectangle "LCheckTransportation" as transportation {
			rectangle "LTransportationDataCollection" as transportationdatacollection
			rectangle "LTransportationValidation" as validationt
		
			transportationdatacollection - validationt
		}
		rectangle "LCalculate" as calculate {
			rectangle "LTimeDifference" as timediff
		}
		rectangle "LNotifyInformation" as notify {
			rectangle "LDisplayText" as displaytext
			rectangle "LSpeakerOut" as speakerout
			displaytext - speakerout
		}
		rectangle "LInputReport" as inputreport {

		}
		rectangle "LFinishReport" as finish
				
		locationdata -down- locationdatacollection
		transportationdata -down- transportationdatacollection
		validationl - timediff
		validationt - timediff
		timediff - displaytext
		locationdata -up- database
		transportationdata -up- database
		inputreport -- finish

	}

database "SQLite" as database {
	
}
@enduml