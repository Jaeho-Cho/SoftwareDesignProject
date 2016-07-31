@startuml
!pragma horizontalLineBetweenDifferentPackageAllowed

Rectangle ":onSchedule" {
	Package "GUI"<<layer>> {
		
	}
	Package "Application" <<layer>> {
		
	}
	Package "SystemService" <<layer>> {
		
	}
	Package "Library" <<layer>> {
		
	}
	
	GUI .d. Application
	Application .d. SystemService
	Application .r. Library
}
Package "Hardware" <<layer>>

SystemService .d. Hardware
@enduml