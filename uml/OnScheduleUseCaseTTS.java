@startuml
left to right direction

skinparam packageStyle rect
actor User

rectangle "Enable Text To Speech" as Register {
  User -- (Execute OnSchedule)
  (Execute OnSchedule) -> (Display Intro)
  (Display Intro) --> (Main Menu Entry)
  (Main Menu Entry) -> (Click Settings Button)
  (Click Settings Button) --> (Show TTS Enable Switch Button)
  (Show TTS Enable Switch Button) .> (Enable) : include
  (Show TTS Enable Switch Button) .> (Disable) : include

}
@enduml