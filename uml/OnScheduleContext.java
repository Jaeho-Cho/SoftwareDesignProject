@startuml
left to right direction
skinparam packageStyle rect
actor User
actor Network


rectangle "OnSchedule" as OnSchedule {

  User -- (Managing schedules)
  User -- (Receiving information whether user is late or not)
  Network -- (Providing the time required to destination and real-time transportation information)

}
@enduml