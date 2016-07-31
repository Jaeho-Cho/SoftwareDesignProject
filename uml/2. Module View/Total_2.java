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
			
		}
		rectangle "MCheckData" as checkdata <<module>>{

		}
		rectangle "MCalculate" as calculate <<module>>{

		}
		rectangle "MURLComposer" as urlcomposer <<module>>{

		}
		rectangle "MViewPrivacy" as viewPrivacy <<module>> #Yellow{

		}
	}
	
	Package "SystemService" <<layer>> {
		
		rectangle "MProximityReceiver" as proximity <<module>>{
			
		}
				
		rectangle "MInputManager" as inputmanager <<module>>{
	
		}
	
		rectangle "MDataBuffer" as databuffer <<module>>{
	
		}
		rectangle "MURLrequest" as urlrequest <<module>>{
			
		}
		
		rectangle "MEventListener" as eventListener <<module>> #Yellow{
			
		}
		
		rectangle "MSystemExit" as systemExit <<module>> #Yellow{
			
		}
		rectangle "MPrefStorage" as prefStorage <<module>> #Yellow{
			
		}
	}
	
	Package "Library" <<layer>> {
		rectangle "MDatabaseClient" as databaseclient <<module>>{
			
		}
		rectangle "MHttpClient" as httpclient <<module>>{

		}
		rectangle "MJSONParser" as jsonparser <<module>>{
			
		}
		rectangle "MSpeakerOut" as speakerout <<module>>{
			
		}
		rectangle "MPrefs" as prefs <<module>> #Yellow {
			rectangle "MPrefRead" as prefRead <<module>>{
				
			}

			rectangle "MPrefs" as mprefWrite <<module>>{

			}
		}
	}
	
	GUI .d. Application
	Application .d.. SystemService
	Application .d. Library
}

Package "Hardware" <<layer>> {
	rectangle "STouchDeviceController" as touch <<subsystem>>{
		
	}
}

SystemService .d. Hardware
@enduml