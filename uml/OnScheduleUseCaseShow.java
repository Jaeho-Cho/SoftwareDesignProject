@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Show Schedule" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Show Schedule Button)
  (Click Show Schedule Button) --> (Show Schedule Menu Entry)
  (Show Schedule Menu Entry) -> (Display Registered Schedule List)

}
@enduml