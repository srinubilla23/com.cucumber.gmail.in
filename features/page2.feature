Feature: Hello Google 

Scenario Outline: gmail login 
 
	Then Enter "<password>" 
	And click Next Button 
	When mailid and password correct expected to display gmail home page 
	Then close site 
	
	Examples: 
		|password	 |
		|987654321 |
