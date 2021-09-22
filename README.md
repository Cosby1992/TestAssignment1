# Assignment 1

## Collaborators 
Anders, Dmitro, Ditlev

## 1 Reflection 
### 1.1 Shooting
#### Question:
A woman fired a shot at a man with her gun, but the man did not die. 
List the possible reasons for the man not dying.
#### Answer: 
- The gun was out of ammunition
- The woman missed the man with her shot
- The man had protective armor or a shield, or something
- The gun fired rubber bullets (or sandbags, toy gun, watter gun, fired blanks etc.)
- The man is immortal
- The gun jammed
- The shot was not fatal
- The man was already dead
- The man was in cover behind something like a wall or bulletproof glass

### 1.2 Alien
#### Question
An alien meets you and it asks you to teach it how to brush its teeth. 
Assume that the alien has teeth exactly like yours, and is as smart as you, but it 
needs a clear step-by-step instruction. List the steps.Be as detailed as you can.  
(Example: Hold the toothpaste with your left hand; turn the cap anti-clockwise)

#### Answer 
__Preconditions:__ The alien has its toothbrush and toothpaste within reach.
<br>__Timeframe:__ This procedure should be completed within 10 minutes. If it is taking
significantly longer, you should seek additional help from video guides or 
someone who can help you in "person"/alien
<br>__Frequency of occurence:__ Morning and evening

- Pick up the toothbrush with your left hand.
- Pick up the toothpaste with your right hand.
- Use your left hand using the index finger and thumb to turn the lid of the toothpaste counterclockwise until the lid it is free from the tube, while holding the toothbrush.
- Place the removed lid on a flat surface
- Hold the toothbrush in front of you, easily accessible for the right hand.
- Adjust the way you hold the toothbrush such that it is in a horizontal position with the hairs upwards.
- Make sure you do not block the hairs on the toothbrush with anything
- Now keep holding the toothpaste, and position it vertically with the lid end downwards precisely over the hairs of the toothbrush.
- Gently squeeze the toothpaste tube until you have approx. 1.5 cm toothpaste resting on the hairs of the toothbrush.
- Now gently scrape the toothpaste on the hairs of the toothbrush while releasing pressure from the toothpaste.
- Place the toothpaste on a flat surface
- Orient the toothbrush with the hairs facing your teeth
- Move the toothbrush towards your teeth until the toothbrush have a mild pressure against your front teeth
- Now brush each individual tooth on each of its accessible surfaces until each surface have been brushed 10 times.
- Remove the toothbrush from your teeth
- Use your right hand to turn on a water faucet (preferably one with a sink underneath).
- Wash the toothbrush by holding its hairs under the running water from the faucet.
- Continue until the water looks clear when leaving the toothbrush
- Place the toothbrush on a flat surface
- Now spit remaining toothpaste from your mouth into the sink
- Fill your mouth with water from the faucet and spit it out until the water looks clear when exiting your mouth
- Leave the cleaning up for someone else and go do cool alien stuff

## Two katas

### Fahrenheit to celsius conversion and Conversion to roman numerals
Solved with TDD, the code is committed everytime a bullet point from the list below is coded (except repeat)
 - Write a test (that fails)
 - Write code to solve test (green bar)
 - Refactor
 - Repeat

#### To run
This project uses maven and is compiled with JDK 17 (it is possible to use a lower 
version of java, but you will need to change the project settings and change the 
target and compile JDK in `pom.xml`)

- Clone this repository
- Open the project in your preferred Java IDE (this is made in intelliJ)
- Navigate to the Cucumber runner class `src/test/java/dk/cosby/cph/test/cucumber/RunCucumberTest.java`
- Run the test class

#### Code walk-through
Tests are located in the test folder ``src/test``
<br>Feature files are located in ``src/test/resources/features``
<br>Step definitions for feature files are located in ``src/test/java/dk/cosby/cph/test/cucumber``
<br>The code being tested is located in ``src/main/java/dk/cosby/cph/test``

### Give your thought on TDD
TDD gives us the impression that it is good at insuring the correct functionality is implemented. 
This however is only applicable when the tests cases are thorough and well written.
However, we must say we feel like it is a bit tedious to write code, that you know will not work 
for the next test cases that will be written in five minutes. We feel like it could be 
optimized by writing more test cases before starting the actual implementation. 
It is however good at breaking the problem down into understandable bits, and has helped us
understand the problem domain for the cases before implementation. With relatively easy 
problem domains like the ones in this assignment, we feel like it was slowing us down a bit. 
But that could also very well be due to us being new to the test framework (Gherkin, Cucumber). 


So all in all we give it three stars out of five for now. 
<br>★★★☆☆ 


