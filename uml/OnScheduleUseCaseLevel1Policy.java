
@startuml
left to right direction
skinparam packageStyle rect
actor User

rectangle "Accept Policy" as OnSchedule {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) --> (Display Intro)
  (Display Intro) --> (Show Policy)
  (Show Policy) .> (Accept): include
  (Show Policy) .> (Cancel): include


}
@enduml