@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Modify Schedule" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Show Schedule Button)
  (Click Show Schedule Button) --> (Show Schedule Menu Entry)
  (Show Schedule Menu Entry) -> (Click a schedule from the schedule list)
  (Click a schedule from the schedule list) --> (Register Schedule Menu Entry)
  (Register Schedule Menu Entry) -> (Modify Information)
  (Modify Information) --> (Click Save Button)

}
@enduml