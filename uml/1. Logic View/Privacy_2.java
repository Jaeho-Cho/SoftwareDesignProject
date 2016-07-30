@startuml
left to right direction
actor User as u
rectangle "LTouchDiviceController" as touch {

}

rectangle ":onSchedule" {

rectangle "LInputManager" as inputmgr {
	rectangle "LClickListner" as lister
	rectangle "LEventHandler" as eventhd

}
rectangle "LDisplayManager" as disp
rectangle "LPrivacy" as privacy {
		rectangle "LViewPrivacy" as viewprivacy
		database "LPrefStorage" as prefstorage
		rectangle "LPrefs" as prefs {
		rectangle "LPrefRead" as prefread
		rectangle "LPrefWrite" as prefwrite
	}
	

	
	viewprivacy <- prefread : agree_status
	viewprivacy -> prefwrite  : agree_status

	prefread <- prefstorage
	prefwrite -> prefstorage
}
u --> touch
touch --> lister
disp -- viewprivacy
eventhd <- lister
eventhd - viewprivacy
}
@enduml