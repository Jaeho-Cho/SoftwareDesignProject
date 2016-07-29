@startuml

rectangle "Receive Information" {
	rectangle "ELocationInfoProvider" as location <<process>> {
		rectangle "MLocationInfoManager " as locationinfo <<module>>
	}
	
	rectangle "EDataCollection " as read <<process>> {
		rectangle "MDataManager " as datamanager <<module>>
	}
	rectangle "ETransportationInfoProvider" as transportation <<process>> {
		rectangle "MTransportationInfoManager " as transportinfo <<module>>
	}
	rectangle "ECalculator" as calculate <<process>> {
		rectangle "MCalculateManager " as calculatemanager <<module>>
	}
	
	rectangle "EDisplay" as notify <<process>> {
		rectangle "MDisplayManager " as displaymanager <<module>>
	}
	
	datamanager - locationinfo
	datamanager - transportinfo
	locationinfo - calculatemanager
	transportinfo - calculatemanager
	calculatemanager -down- displaymanager
}

@enduml