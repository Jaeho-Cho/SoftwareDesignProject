@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Register Schedule" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Register Schedule Button)
  (Click Register Schedule Button) --> (Register Schedule Menu Entry)
  (Register Schedule Menu Entry) -> (Input Schedule Information)
  (Input Schedule Information) --> (Click Save Button)

}
@enduml