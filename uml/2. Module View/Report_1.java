@startuml

rectangle "Receive Information" {
	rectangle "MLocationInfoProvider" as location <<module>> {
		rectangle "MLocationInfoManager " as locationinfo <<module>>
	}
	
	rectangle "MDataCollection " as read <<module>> {
		rectangle "MDataManager " as datamanager <<module>>
	}
	rectangle "MTransportationInfoProvider" as transportation <<module>> {
		rectangle "MTransportationInfoManager " as transportinfo <<module>>
	}
	rectangle "MCalculator" as calculate <<module>> {
		rectangle "MCalculateManager " as calculatemanager <<module>>
	}
	
	rectangle "MDisplay" as notify <<module>> {
		rectangle "MDisplayManager " as displaymanager <<module>>
	}
	location .> read
	transportation .> read
	calculate .> location
	calculate .> transportation
	notify .> calculate

}

@enduml