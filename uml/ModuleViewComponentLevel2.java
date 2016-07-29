@startuml
package "OnSchedule" {
	package "Database" {
	
    package "SchedDataBase" {


		} 
		  
	  package "LocationDataBase" {

		} 
	  
	  package "SubWayNameIDDataBase" {

		} 

	  
	}

package "InputOutput" {
	
    package "LocationPointXY" {


		} 
		  
	  package "SchedConstant" {

		} 
	  
	  package "SubwayInfo" {

		} 
	  
	  package "SubwayNameIDInfo" {

		} 
	  
    
	  package "SchedInfo" {

		} 
	  
	  package "SchedInfoDetail" {

		} 
	  
	  package "LocationInfo" {

		} 

	  
	}

	package "Parser" {
	
		package "JSONManager" {


		} 
		        
	    			  
	}
	
	package "Receiver" {
		
	      package "ProximityReceiver" {


			} 
			  
		  package "AlarmReciver" {

			} 
		  

	      
		    			  
		}
	
	package "View" {
		
	      package "ShowSchedActivity" {


			} 
			  
		  package "ReportActivity" {

			} 
		  
		  package "MainActivity" {

			} 
		  
		  package "RegisterSchedTimeActivity" {

			} 
		  
		  package "SettingsSchedActivity" {

			} 
		  
		  package "RegisterSchedDateActivity" {

			} 
	      
		  package "IntroActivity" {

			} 

		  
		}
	
	    package "DAUM Open API" as DAUM {
	
			}
    
	    package "Public Data Open API" as Public {
	
			}
}
@enduml