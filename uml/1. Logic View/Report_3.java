@startuml

actor User
actor Network
rectangle "LReportService" as report {
	rectangle "LReadData" as readreport {
		rectangle "LLocationData" as locationdata
		rectangle "LTransportationData" as transportationdata
	}
	
		rectangle "LCheckLocation" as location {
			rectangle "LLocationDataCollection" as locationdatacollection
			rectangle "LLocationValidation" as validationl
		

		}
		

		rectangle "LCheckTransportation" as transportation {
			rectangle "LTransportationDataCollection" as transportationdatacollection
			rectangle "LTransportationValidation" as validationt
		

		}
		rectangle "LCalculate" as calculate {
			rectangle "LTimeDifference" as timediff
		}
		rectangle "LNotifyInformation" as notify {
			rectangle "LDisplayText" as displaytext
			rectangle "LSpeakerOut" as speakerout

		}

		rectangle "LFinishReport" as finish
				
		rectangle "LProximityReceiver" as proximity {
			
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
rectangle "LCommunication" as export {
	rectangle "LURLrequest" as urlrequest {
		
	}
	rectangle "LJSONParser" as jsonparser {
		
	}
}
rectangle "LHttpClient" as httpclient {
	rectangle "LRequestData" as httprequest {
		
	}
	rectangle "LRespondData" as httprespond {
		
	}
}
rectangle "LURLComposer" as urlcomposer {
	rectangle "LDaumMap" as daummap {
		
	}
	rectangle "LPublicTransporation" as publictransportation {
		
	}
}

database "SQLite" as database {
	
}
User -down- touch
touch -down- inputclick
inputclick -down- finish
database -down- databaseclient
databaseclient -down- readbuffer
readbuffer -down- locationdata
readbuffer -down- transportationdata
locationdata -down- locationdatacollection
locationdatacollection -right- validationl
transportationdata -down- transportationdatacollection
transportationdatacollection -right- validationt
validationl -down- timediff
validationt -down- timediff
timediff -down- displaytext
displaytext -right- speakerout
displaytext -down- displaymanager
Network -down- httprequest
Network -down- httprespond
httprequest -down- urlrequest
httprespond -down- jsonparser
jsonparser -down- transportationdatacollection
Network -down- proximity
proximity -up- publictransportation
publictransportation -up- urlrequest































@enduml