@startuml
actor Network
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
	Network -down- httprequest
	Network -down- httprespond
	httprequest -down- urlrequest
	httprespond -down- jsonparser
	urlrequest -down- daummap
	urlrequest -down- publictransportation
}
@enduml