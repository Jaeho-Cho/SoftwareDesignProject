@startuml
!pragma horizontalLineBetweenDifferentPackageAllowed

Rectangle ":onSchedule" {
	Package "GUI"<<layer>> {
		rectangle "MDisplayText" as displaytext <<module>> {
			
		}
		rectangle "MDisplayManager" as displaymanager <<module>> {
			
		}
	}
	Package "Application" <<layer>> {
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
	Package "SystemService" <<layer>> {

		
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
	Package "Library" <<layer>> {
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
	
	GUI .d. Application
	Application .d. SystemService
	Application .d. Library
}
Package "Hardware" <<layer>> {
	rectangle "STouchDeviceController" as touch <<subsystem>>{
		
	}
}

SystemService .d. Hardware
@enduml