@startuml
actor User

participant "View" as A
participant "Database" as C
participant "Location" as E
participant "DAUM" as F
participant "Parser" as G
participant "Open" as H

activate A
A -> A : Triggered by Alarm of the Registered Schedule
User <- A : Report Service is Provided
User -> A : Start To Receive Information
A -> C :  Query Schedule Database
deactivate A
activate C
C -> C : Get Schedule Database Information
C --> A : Done
deactivate C
activate A
deactivate A
A -> E : Request Current Location
deactivate A
activate E
E -> E : Get Current Location
deactivate A
E --> A : Done
deactivate E 
activate A
deactivate A
A -> A : Verify Current Location Matches Registered Departure
A -> E : Request to Register Proximity Alerts of the Destination and Routes that have been Registered
deactivate A
activate E
E -> E : Register Proximity Alerts of the Destination and Routes that have been Registered
E --> A : Done
deactivate E
activate A
A -> A : Notify User need to go out within 20 minutes to meet the schedule
A -> F : Request Text To Speech
deactivate A
activate F
F -> F : Notify with Audio Device
F --> A : Done
deactivate F
activate A
A -> E : After 20 minutes, Request Current Location
deactivate A
activate E
E -> E : Get Current Location
E --> A : Done
deactivate E
activate A
A -> A : Verify User go out from the departure
A -> E : Alarm from Location that User reaches to the routes
deactivate A
activate E
E -> E : Send Event
E --> A : Done
deactivate E
activate A
A -> G : Request transportation information that user need to ride

deactivate A
activate G
G -> H : Request Transportation Estimated Arrival Times
deactivate G
activate H
H -> H : Get Transportation Estimated Arrival Times
H --> G : Done
deactivate H
activate G
G --> A : Done
deactivate G
deactivate G
activate A
A -> A : Notify transportation information that user need to ride
A -> F : Request Text To Speech
deactivate A
activate F
F -> F : Notify with Audio Device
F --> A : Done
deactivate F
activate A
A -> A : After judge whether user meet the schedule, notify behavior pattern such as "run" or "walk"
A -> E : Alarm from Location that User reaches to the destination
deactivate A
activate E
E -> E : Send Event
E --> A : Done
deactivate E
activate A
A -> F : Request Text To Speech
deactivate A
activate F
F -> F : Notify with Audio Device
F --> A : Done
deactivate F
activate A
A -> User : Finish
deactivate A




@enduml