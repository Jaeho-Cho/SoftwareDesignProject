@startuml
left to right direction
rectangle "LPrivacy" as privacy {
	rectangle "LViewPrivacy" as viewprivacy
	database "LPrefStorage" as prefstorage
	rectangle "LPrefs" as prefs {
		rectangle "LPrefRead" as prefread
		rectangle "LPrefWrite" as prefwrite
	}
	
	rectangle "LInputPrivacy" as inputcomm
	
	inputcomm -- viewprivacy
	viewprivacy <- prefread : agree_status
	viewprivacy -> prefwrite  : agree_status

	prefread <- prefstorage
	prefwrite -> prefstorage
}
@enduml