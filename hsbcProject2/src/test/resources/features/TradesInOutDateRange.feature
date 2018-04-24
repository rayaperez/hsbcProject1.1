Feature: Trade List
	As HSBC user
	In order to review all valid trades
	I want to view all trades with specific dates
	
Background:
	Given I have a file instrument "inst.txt" and a file trade "trade.txt"
	And both files are valid
	
@Automated @UnitTest	
Scenario Outline: Trade list
	Given I have a range date from "<dateFrom>"
	And I have a date to "<dateTo>"
	When I check trade transactions for that range
	Then I receive an output if trade is in or out
	
	Examples: 
	| dateFrom   | dateTo     |
	| 30/01/2017 | 14/01/2018 |