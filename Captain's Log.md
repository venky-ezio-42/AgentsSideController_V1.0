# AgentsSideController_V1.0
First basic of successful execution of strategy pattern design, where objects are created using 'new' keyword.

We start off in the beginning by planning out what the program should be doing.
In our case it takes a parameter "name" as input ans assigns it to the String variable "type".

Based on tha value of "type" we then call the mission() function and display it by overwriting "type"(In this case).
{     Can seperately print it out too by simply calling the function...      }

If the input does'nt match either of the conditions, we assign a failsafe value to the variable "type" and print it.


Now that the idea of the program is clear, we start off by first creating an interface which will have the method that will change based on input provided in URL.

Then we create 2 implementations of the Interface. [Attacker & Defender]

We move on to build our SideController after that.
Request the mapping for the URL we are working on. [ ("/side") in this case. ]
Using 'HttpServletRequest' we can get the input.
Store the input in a String variable. [ "type" in this case ]
Based on the input we use if/else conditions to implement the method of 'mission()' based on the class it is being called from.
