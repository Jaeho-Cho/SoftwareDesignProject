@startuml
actor User

participant "ReportActivity" as A


activate A
A -> A : Running Report Service
User -> A : Click Finish Report Service Button
User <-- A : Report Service finishes

@enduml