@startuml

displaytext <.down. timediff 
displaytext .> displaymanager
validationl <.up. timediff
validationt <.up. timediff
touch <.up. inputclick
inputclick <.up. finish
databaseclient <. readbuffer
readbuffer <.up. locationdata
readbuffer <.up. transportationdata
locationdata <.up. locationdatacollection
locationdatacollection <. validationl
transportationdata <.up. transportationdatacollection
transportationdatacollection <.left. validationt



httprequest <.up. urlrequest
httprespond <. jsonparser
jsonparser <.up. transportationdatacollection

proximity <. publictransportation
publictransportation <.down. urlrequest
speakerout .up.> displaytext

rectangle GUI <<layer>> {
	rectangle "MDisplayText" as displaytext <<module>> {
		
	}
	rectangle "MDisplayManager" as displaymanager <<module>> {
		
	}
	
}

rectangle Hardware <<layer>> {
	rectangle "STouchDeviceController" as touch <<subsystem>>{
		
	}
}

rectangle SystemService <<layer>> {


			
	rectangle "MProximityReceiver" as proximity <<module>>{
		
	}
		
rectangle "MInputManager" as inputmanager <<module>>{
	rectangle "MInputClick" as inputclick <<module>>{
		
	}
	rectangle "MInputData" as inputdata <<module>>{
		
	}
	rectangle "MFinishReport" as finish <<module>>{
		
	}
}

rectangle "MDataBuffer" as databuffer <<module>>{
	rectangle "MDataReadBuffer" as readbuffer <<module>>{
		
	}
	rectangle "MDataWriteBuffer" as writebuffer <<module>>{
		
	}
}
rectangle "MURLrequest" as urlrequest <<module>>{
	
}

}
rectangle Libraries <<layer>> {
	rectangle "MDatabaseClient" as databaseclient <<module>>{
		
	}
	rectangle "MHttpClient" as httpclient <<module>>{
		rectangle "MRequestData" as httprequest <<module>>{
			
		}
		rectangle "MRespondData" as httprespond <<module>>{
			
		}
	}
	rectangle "MJSONParser" as jsonparser <<module>>{
		
	}
	rectangle "MSpeakerOut" as speakerout <<module>>{
		
	}

}
rectangle Application <<layer>> {
	rectangle "MReadData" as readreport <<module>>{
		rectangle "MLocationData" as locationdata <<module>>{
			
		}
		rectangle "MTransportationData" as transportationdata <<module>>{
			
		}
	}
	rectangle "MCheckData" as checkdata <<module>>{

		rectangle "MCheckLocation" as location <<module>>{
			rectangle "MLocationDataCollection" as locationdatacollection <<module>>{
				
			}
			rectangle "MLocationValidation" as validationl <<module>>{
				
			}
		

		}
		

		rectangle "MCheckTransportation" as transportation <<module>>{
			rectangle "MTransportationDataCollection" as transportationdatacollection <<module>>{
				
			}
			rectangle "MTransportationValidation" as validationt <<module>>{
				
			}
		

		}
	}
		rectangle "MCalculate" as calculate <<module>>{
			rectangle "MTimeDifference" as timediff <<module>>{
				
			}
		}
		rectangle "MURLComposer" as urlcomposer <<module>>{
			rectangle "MDaumMap" as daummap <<module>>{
				
			}
			rectangle "MPublicTransporation" as publictransportation <<module>>{
				
			}
		}

}
























@enduml