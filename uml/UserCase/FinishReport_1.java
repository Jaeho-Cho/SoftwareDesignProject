@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Finish Report Service" as Register {
  User -- (Triggered by Alarm of the Registered Schedule)
  (Triggered by Alarm of the Registered Schedule) -> (Report Service is running)
  (Report Service is running) --> (Click Finsh Report Button)
  (Click Finsh Report Button) -> (Finsh Report)

}
@enduml