@AutomationFeature
Feature: Validation of the job search filter on the Choucair website
AS a web user
I want to use the job search filter on the Choucair website
TO search for vacancies according to my search criteria

Background: 
Given that Carolayn enters the website on option Empleos


@tag1
Scenario Outline: enter valid data in the search filter
When she enters valid data into the job search filter <keyword> <location>
Then she should see the search results <message>

Examples:

| keyword   | location |   message    |
| Analista  |          |  completada  |
|           | medellin |  completada  |
| Pruebas   | Panama   |  completada  |



@tag2
Scenario Outline: enter invalid data in the search filter
When she enters the data <keyword> <location>
Then she should see an error message <message>

Examples:

| keyword   | location |                      message             |
|   11      |   cali   | No hay trabajos correspondientes         |
|   @       |   bogota | No hay trabajos correspondientes         |
| 'm3dell1n'|          | No hay trabajos correspondientes         |
