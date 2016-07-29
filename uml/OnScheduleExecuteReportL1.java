@startuml

rectangle "Receive Information" {
	rectangle "ELocationInfoProvider" as location <<process>> {
		rectangle "MLocationInfoManager " as locationinfo <<module>>
	}
	
	rectangle "EDataRead" as read <<process>> {
		rectangle "MDataReadBuffer " as datamanager <<module>>
	}
	rectangle "ETransportationInfoProvider" as transportation <<process>> {
		rectangle "MTransportationInfoManager " as transportinfo <<module>>
	}
	rectangle "ECalculator" as calculate <<process>> {
		rectangle "MCalculateManager " as calculatemanager <<module>>
	}
	
	rectangle "EDisplayInfo" as notify <<process>> {

	}
	
	datamanager - locationinfo
	datamanager - transportinfo
	locationinfo - calculatemanager
	transportinfo - calculatemanager
	calculatemanager -down- notify
	notify - displaymanager
	datamanager -up- databaseclient
	databaseclient -up- database
}
rectangle "EDisplayManager" as displaymanager <<process>> {
	
}
rectangle "MDatabaseClient" as databaseclient <<process>> {
	
}
database "SQLite" as database {
	
}
@enduml