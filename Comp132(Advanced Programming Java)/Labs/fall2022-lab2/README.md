# IMPORTANT NOTE 1:
For each lab assignment, **you must include and sign (by writing your name and student id number) the following Pledge of Honor statement at the beginning of your main method source code file. After including this statement, make sure that you do the commit and push operation on GitHub. Otherwise, your lab solution will not be graded.**
```
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: İdil İşsever, 80447
********************************************************************************/
```

## IMPORTANT NOTE 2: After you complete the tasks, do not forget to commit your changes and push them to your repository on Github.

## IMPORTANT NOTE 3: This README.md file only contains the instructions for PRELAB. You will also have INLAB questions.

INLAB QUESTIONS WILL BE ANNOUNCED AT COURSE WEBSITE AT THE START OF EACH LAB: [https://sites.google.com/a/ku.edu.tr/comp132/programming-labs](https://sites.google.com/a/ku.edu.tr/comp132/programming-labs).

## Lab-2 Prelab: Hire an Engineer

In this programming lab, you are given a scenario and a Java project. You are asked to write multiple class declarations, implement the methods desribed and test the correctness of your implementation by using the test code given in the project. Please note that we may test your codes by other test cases as well.


Scenario: There exists a set of companies each consisting of positions which are assigned to engineers. Every engineer has an education level and every position requires a minimum education level for its engineers. An engineer may be employed in more than one company. The education hierarchy, in decreasing order, is PHD, MS, and BS.



## Class Descriptions:

Create a package named company, then inside of this package, define the following Java classes. For each class, you should implement the methods described below. You may also add other methods if needed.

## Engineer class

Engineer class should have the following private fields: 

```
Name of engineer (String)
ID of engineer (String)
Education level of engineer (String)
```


- Write a three-argument constructor for Engineer which takes the following arguments: name, ID, and education level of engineer.
               
- Write upgradeLevel() method. This method takes no argument and upgrades the education level of the Engineer by one. For instance, if the education level is “BS”, it upgrades it to “MS”. If the education level is “PHD”, it does nothing. 

- Write upgradeLevel(String toLevel) method. This method takes an education level as a toLevel parameter and checks whether it is higher than the current education level of the engineer, if it is, it sets the education level of the Engineer to a given level. For instance, if the Engineer is a “BS” and the argument is “PhD”, the education level changes. However, if  the current level is “MS” and the argument is “BS”, it does nothing.




## Position class

Position class should have the following private fields:

```
Name of position (String)
Fixed-size array of engineers (Engineer[]) - with size 6.
Minimum required education level (String)
```


- Write a two argument constructor for Position, which takes the following arguments: name and minimum required education level. 

- Write hireEngineer(Engineer engineer) method. This method checks the education level of the Engineer and if it is equal or higher than the required level in the position class, it adds the Engineer to the array of engineers. If the array is full or the engineer’s education level does not meet the minimum requirement, the method should return False, else True. 


## Company class

Company class should have the following private fields:
```
Name of company (String)
Fixed-size array of positions (Position[]) - with size 5
```

- Write a one-argument constructor for Company which takes the following argument:  name of the company.

- Write openPosition(String positionName, String minEducationLevel) method which creates a position with the given name and minimum required education level, then adds it to the first available slot in the positions array.

- Write hireEngineer(String positionName, Engineer engineer) method. This method finds the position in the company’s position array with the given name, and calls its hireEngineer method with the engineer parameter. If the position with the given name does not exist for the company, the method returns False.

- Write toString() method which returns a string representation of the Company class containing the name of the company, name of the positions, minimum required education levels for positions, and the list of the hired engineers for this position. Please ensure that you provide the following string format:



--------------------------------------------------------------------------------------------------------
```

Position Name: <position name>
Company Name: <company name>
Minimum Educational Level: <education level>
Hired Engineers:
<Engineer ID> <Engineer name>
…
<Engineer ID> <Engineer name>
…

Position Name: <position name>
Company Name: <company name>
Minimum Educational Level: <education level>
Hired Engineers:
<Engineer ID> <Engineer name>
…
<Engineer ID> <Engineer name>
…
```
--------------------------------------------------------------------------------------------------------









# Expected output of the given test code:


```

Position Name: Graphic Designer
Company Name: Meta
Minimum Educational Level: BS
Hired Engineers:
38899 John
06569 Dennis
04956 Phoebe


Position Name: Manager
Company Name: Telegram
Minimum Educational Level: MS
Hired Engineers:
03121 Mary
08953 Cate
93201 Andrew


Position Name: Research Engineer
Company Name: Twitter
Minimum Educational Level: PHD
Hired Engineers:
05786 Carey
38899 John
06569 Dennis
03121 Mary

```



