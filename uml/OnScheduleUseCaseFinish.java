@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Exit OnSchedule" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Exit Button)
  (Click Exit Button) --> (Exit OnSchedule)


}
@enduml