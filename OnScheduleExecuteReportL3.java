@startuml

displaytext -left- timediff : IPC

validationl - timediff : IPC
validationt - timediff : IPC
touch -up- inputclick : IPC

databaseclient -down- readbuffer : IPC




httprequest -up- urlrequest : IPC
httprespond - jsonparser : IPC
jsonparser -up- transportationdatacollection : IPC

proximity - publictransportation : IPC


rectangle "EReport" as reportprocess <<process>> {
	rectangle "EDisplayText" as displaytext <<thread>> {
		
	}
	rectangle "MDisplayManager" as displaymanager <<module>> {
		
	}
	rectangle "MSpeakerOut" as speakerout <<thread>>{
		
	}
}

	rectangle "ETouchDeviceController" as touch <<process>>{
		
	}





			
	rectangle "EProximityReceiver" as proximity <<process>>{
		
	}
		
rectangle "EInputManager" as inputmanager <<process>>{
	rectangle "MInputClick" as inputclick <<module>>{
		
	}
	rectangle "MInputData" as inputdata <<module>>{
		
	}
	rectangle "MFinishReport" as finish <<module>>{
		
	}
}





	rectangle "EDatabaseClient" as databaseclient <<process>>{
		
	}
	rectangle "EHttpClient" as httpclient <<process>>{
		rectangle "TRequestData" as httprequest <<thread>>{
			
		}
		rectangle "TRespondData" as httprespond <<thread>>{
			
		}
	}
	rectangle "EJSONParser" as jsonparser <<process>>{
		
	}


	rectangle "ECheckDataProcess" as checkdataprocess <<process>>{
	rectangle "MDataBuffer" as databuffer <<module>>{
		rectangle "MDataReadBuffer" as readbuffer <<module>>{
			
		}
		rectangle "MDataWriteBuffer" as writebuffer <<module>>{
			
		}
	}
	rectangle "MReadData" as readreport <<module>>{
		rectangle "MLocationData" as locationdata <<module>>{
			
		}
		rectangle "MTransportationData" as transportationdata <<module>>{
			
		}
	}
	rectangle "TCheckData" as checkdata <<thread>>{

		rectangle "TCheckLocation" as location <<thread>>{
			rectangle "TLocationDataCollection" as locationdatacollection <<thread>>{
				
			}
			rectangle "TLocationValidation" as validationl <<thread>>{
				
			}
		

		}
		rectangle "TCheckTransportation" as transportation <<thread>>{
			rectangle "TTransportationDataCollection" as transportationdatacollection <<thread>>{
				
			}
			rectangle "TTransportationValidation" as validationt <<thread>>{
				
			}
		

		}
	}
	}
		


		rectangle "ECalculate" as calculate <<process>>{
			rectangle "TTimeDifference" as timediff <<thread>>{
				
			}
		}
		
		rectangle "EURLComposer" as eurlcomposer <<process>> {
		rectangle "MURLComposer" as urlcomposer <<module>>{
			rectangle "MDaumMap" as daummap <<module>>{
				
			}
			rectangle "MPublicTransporation" as publictransportation <<module>>{
				
			}
		}
		rectangle "MURLrequest" as urlrequest <<module>>{
			
		}
		}


























@enduml