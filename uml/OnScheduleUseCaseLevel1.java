@startuml
left to right direction
skinparam packageStyle rect
actor User

rectangle "OnSchedule" as OnSchedule {
  User -- (Execute OnSchedule)	
  User -- (Accept Policy)
  User -- (Register Schedule)
  User -- (Modify Schedule)
  User -- (Delete Schedule)
  User -- (Show Schedule)
  User -- (Enable Text To Speech)
  User -- (Receive Information)
  User -- (Finish Report Service)
  User -- (Exit OnSchedule)


}
@enduml