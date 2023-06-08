# Welcome to LabLoader
This repository is a utility to help you access Revature coding labs.
Please note that the utility is a "beta" version of infrastructure to come and there may be unexpected issues with its use. Error messages might not be descriptive enough to help you solve the issue, and your trainer may help you access the lab content in a more manual form. If you encounter issues that prevent you from progressing through the content, please reach out to your trainer. Some features, such as saving progress on labs, have not been implemented yet. The content itself is also new, so any recommendations for improvement can be directed towards your trainer / ted balashov.

# Labs manifest
Here is a library of all coding labs, in order, by unit. Your actual curriculum may vary. Please consult with your curriculum & trainer to determine which units you should complete.
## Java
Start
HelloWorld
MethodParameters
Comparisons
CombineStrings
IfStatement
BooleanOperators
Add
Subtract
GreaterOrLesser
IntroToOOP
Instantiation
Constructors
Arrays
WhileLoop
ForLoop
Math
EvenOrOdd
HardcodedLogin
FizzBuzz
SetAllArrayElementsToN
ReturnArrayContents
GuessingGame
Exceptions
UncheckedException
ThrowCustomException
Lists
Sets
Map
Queue
Stack
Casting
ArraySum
Average
GetMax
BankAccount
StaticKeyword
Contains
DoesNotContain
ArraysAreEqual
MaxMinusMin
StringMethods
IndexOf
IsSorted
ReturnLongestString
Pyramid
ContainsDuplicates
Search2dArray
CombineArrays
AdvancedBooleans
OtherStringMethods
RemoveAllCharacter
IsThereSum
WordCount
ArrayAbsoluteValue
ParentObjectClassMethods
Overriding
Interfaces
Generic
PigLatin
CharComparison
Isogram
InsertPosition
ReverseAString
LargestSum
MostCommonCharacter
Fibonacci
StringIsPalindrome
SubArray
WordCountMap
## SQL
CreateTable
DropTable
Insert
SelectAll
PrimaryKey
SelectColumns
SelectWhere
Update
Delete
SelectWhereAndOr
OrderBy
GroceryList
Truncate
AlterTable
AggregateFunctions
GroupBy
ForeignKey
InnerJoin
OuterJoin
CreateView
## Javalin
CreatingEndpoints
StatusCodes
PathParameters
RequestBody
FlightTracker
Library
## HTML/CSS
HTMLCSS-CL-HOMEPAGE
HTMLCSS-CL-CSSINLINE
HTMLCSS-CL-CSSSELECTORS
## JavaScript
JS-CL-BUTTONCLICK
JS-CL-BUTTONCOUNTER
JS-CL-INPUT
JS-CL-IFSTATEMENT
JS-MP-LOGIN
JS-CL-ATTRIBUTES
JS-CL-TYPECOERCION
JS-CL-TRUTHYFALSY
JS-CL-FORLOOP
JS-CL-ARRAYS
JS-CL-APPENDINGELEMENTS
JS-CL-OBJECTS
JS-CL-EVENTOBJECT
JS-CL-EVENTLISTENER
JS-CL-ASYNCAWAIT
JS-CL-FETCH
JS-MP-FETCHIMAGE
## Angular
ANG-CL-COMPONENT
ANG-CL-BINDING
ANG-CL-DIRECTIVES
ANG-CL-INPUTOUTPUT
ANG-CL-EVENTEMITTER
ANG-CL-ROUTING
ANG-CL-SERVICE
ANG-CL-LIFECYCLE
ANG-CL-MODELCLASS
ANG-CL-OBSERVABLE
ANG-CL-HTTPCLIENT
## Spring
SPR-CL-DI
SPR-CL-APPLICATIONCONTEXT
SPR-CL-BEANSCOPES
SPR-CL-BOOT
SPR-CL-RESTCONTROLLER
SPR-CL-ENTITY
SPR-CL-LOMBOK
SPR-CL-JPACRUD
SPR-MP-FITNESSAPI
SPR-CL-REQUESTPARAM
SPR-CL-RELATIONSHIPS
SPR-CL-JPAMULTIPLICITY
SPR-CL-NAMEDQUERIES
SPR-CL-QUERY
SPR-MP-ARTAPI
SPR-CL-RESPONSEENTITY
SPR-CL-TRANSACTIONAL
## Docker
DOC-CL-PULL

# How to use
## labs.properties
Before you begin the labs at all, you will need to add a product_key number to the labs.properties file. This will authorize your access to the labs content, and should be provided by your trainer. No other changes should be made to that file.
## CLI
This utility will function as a Command Line Interface written as an executable jar. A jar is like a set of Java classes that have been packaged together for easy transport & use. you can start it up opening the terminal in your IDE and using the command
`java -jar labs.jar`
When you've run the Jar correctly, a set of text should appear instructing you how to open up a lab. labs are not case sensitive, so, for instance, if you'd like to open the docker pull lab, you would enter the command
`open doc-cl-pull`
while the jar is running. You'll need to run labs.jar for every lab you open.
## Unit testing
Many of the labs feature unit testing and TDD. Unit testing is a srategy used extensively in the professional world consisting of some code that can automatically run to ensure that some part of your code runs correctly. In this case, the test cases are there to quickly verify if you've successfully completed the lab. Because the labs provided use a variety of technologies, there are a couple different ways in which the labs need to be run.
### Java, SQL, Javalin, Spring, Docker labs
These labs are tested using Maven and JUnit. You will be required to have a working JDK of at least 11, as well as a working version of maven. You should verify that these are installed using `javac --version` and `mvn --version`. When opening a lab, you may need to click the "refresh" button visible in the top right when navigating the pom.xml file to "refresh java project". You can run the test cases using the terminal command `mvn test`. You wil have to get used to the Maven test output, which will display information about test cases and failures. The test case code itself will be located in the "test" folder of a lab and should NEVER be changed. The test cases are correctly written from the start. All of your cod3e changes should be made in files that explicitly tell you to modify them, usually with a TODO: statement. 
### HTML/CSS/JavaScript labs
If tests are present, they are tested using Maven, JUnit, and Selenium. Selenium requires a chrome web driver that might not be properly configured for your environment, so you should instead opt for manual testing via the browser. The HTML file associated with any particular lab may be opened directly in your browser: you can open the HTML file in your file explorer (either by navigating to your workspace's folder or finding the option to do so by right clicking on the file in your IDE.) After that, you can open any HTML file in your browser. The browser will display all the information you need to test your lab, and you can simply refresh the browser to display the most recent changes from your IDE.
### Angular labs
These labs are tested using Node and Jasmine/Karma. You will be required to have a working version of node, which will come with npm. You can verify that it is installed `npm --version`. You will also need a working version of the Angular CLI, which can be installed with `npm install -g @angular/cli` and verified with `ng --version`. You can run the Angular project using `npm start`, which will start an Angular project that can be opened in a browser on the url `localhost:4200`. The landing page of the Angular app will explain all of the lab instructions. Some of the Angular labs feature unit tests written in Jasmine/Karma in spec.ts files. You can run them using the command `npm test`. Unlike in a Maven project, where all the tests are located in one centralized folder, the tests for every component will be located in a spec.ts file within the component. You can refer to the component that owns a particular test to see what ought to be changed to pass the test. A readme will also be provided pointing you to the right files to modify. If you are learning React, or are not learning a UI framework, then you can safely disregard Angular content during the training period. It is quite useful, however, so you are free to return to the content if you have some downtime after training.

lab content & labloader authored by ted balashov
