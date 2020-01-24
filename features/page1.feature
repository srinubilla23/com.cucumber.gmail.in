Feature: Hello Google 

Scenario Outline: gmail login 
	Given open chromebrowser 
	Then Enter gmail URL 
	When Enterr "<mailid>" 
	And click Nextt Button 
	
	
	Examples: 
		|mailid			       |
		|srinuk247hh@gmail.com |
		
		