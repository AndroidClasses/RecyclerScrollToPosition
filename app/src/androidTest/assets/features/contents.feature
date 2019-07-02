
Feature: Smoothly scroll position
	In order to see all the content item
	As a user of the app
	I want to scroll an item to the top or bottom of the screen

	Background:
		Given I see the content list

	Scenario: User sees contents
		Then  I see more than '0' items

    Scenario Outline: Scroll item to the top
		When I introduce as position '50'
		And  I press the go button
		Then I see the item '50' is in the top
