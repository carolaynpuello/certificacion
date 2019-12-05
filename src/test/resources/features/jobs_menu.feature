@ManualFeature1
Feature: validation of the jobs module menu on the Choucair website
AS a web user
I want to enter the menu options of the jobs module
TO validate the navigability of the menu

Background: 
Given that Carolayn enters the website on option Empleos


@tag3
Scenario Outline: Browse the jobs menu
When she clicks on the option <option>
Then she should see the reference content on the website <content>

Examples:

|        option           |        content          |      
| ¿Qué es ser Choucair?   | SER CHOUCAIR            |
| Convocatorias           | CONVOCATORIAS           |
| Prepararse para aplicar | PREPARARSE PARA APLICAR |
