@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Receive Information" as Register {
  User -- (Triggered by Alarm of the Registered Schedule)
  (Triggered by Alarm of the Registered Schedule) -> (Check Current Location)
  (Check Current Location) --> (Verify Current Location Matches Registered Departure)
  (Verify Current Location Matches Registered Departure) -> (Start Report Service) : yes
  (Verify Current Location Matches Registered Departure) -> (Finish Report Service) : no
  (Start Report Service) --> (Register Proximity Alerts of the Destination and Routes that have been Registered)
  (Register Proximity Alerts of the Destination and Routes that have been Registered) -> (Notify User need to go out within 20 minutes to meet the schedule)
  (Notify User need to go out within 20 minutes to meet the schedule) --> (After 20 minutes, Verify User go out from the departure)
  (After 20 minutes, Verify User go out from the departure) -> (If User reach to the routes, notify transportation information that user need to ride) : yes
  (After 20 minutes, Verify User go out from the departure) --> (Finish Report Service) : no
  (If User reach to the routes, notify transportation information that user need to ride) -> (After judge whether user meet the schedule, notify behavior pattern such as "run" or "walk")
  (After judge whether user meet the schedule, notify behavior pattern such as "run" or "walk") --> (If User reach the destination, notify user in the destination)
  (If User reach the destination, notify user in the destination) -> (Finish Report Service)

}
@enduml