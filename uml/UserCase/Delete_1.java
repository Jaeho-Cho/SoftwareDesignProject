@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Delete Schedule" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Show Schedule Button)
  (Click Show Schedule Button) --> (Show Schedule Menu Entry)
  (Show Schedule Menu Entry) -> (Long Click a schedule from the schedule list)
  (Long Click a schedule from the schedule list) ---> (Appear confirm dialogue)
  (Appear confirm dialogue) .> (Accept) : include
  (Appear confirm dialogue) .> (Cancel) : include

}
@enduml