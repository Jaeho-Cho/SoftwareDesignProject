@startuml

database "SQLite" as database {
	
}
rectangle "LReportService" as report {
	rectangle "LCheckLocation" as location
	
	rectangle "LReadData" as readreport
	rectangle "LCheckTransportation" as transportation
	rectangle "LCalculate" as calculate
	rectangle "LNotifyInformation" as notify
	rectangle "LInpuReport" as inputreport
	rectangle "LFinishReport" as finish
	
	
	location - calculate
	readreport - database
	readreport - transportation
	readreport -- location
	
	calculate - notify
	calculate -- transportation

	inputreport - finish

}
@enduml