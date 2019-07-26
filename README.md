# Predictive-Text

#Predictive Text System
---------------------------
There are keys for digits used for dialing phone numbers. But these keys
were also used to enter letters a->z. When a text message needed to be entered, the keys
corresponding to the letters would be used. However, since there are multiple letters on each
key, the required letter needed to be disambiguated somehow.
In the basic system without predictive text, the user must press the appropriate key a
number of times for a particular letter to be shown. Consider the word "hello". With this
method, the user must press 4, 4, 3, 3, 5, 5, 5, then pause, then 5, 5, 5, 6, 6, 6.
To enter text more easily, the system of predictive text (also called "T9") was devised. The
user presses each key only once and the mobile phone uses a dictionary to guess what word
is being typed using a dictionary, and displays the possible matches. So the word \hello" can
be typed in 5 button presses "43556" without pauses, instead of 13 in the standard system.
The numeric string "43556" is referred to as a "signature" of the world "hello". If this is the
only match, the user can press space and carry on. If there are multiple matches, the user
might need to select one of them before proceeding.
A given numeric-signature may correspond to more than one word. Predictive text
technology is possible by restricting available words to those in a dictionary. Entering the
numeric signature "4663" produces the words "gone" and "home" in many dictionaries.
For simplicity, this predictive text system assumes that the user does not need punctuation or numerals.

There are a variety of implementations for this system using various data structures, ranging from very unefficient to efficient.
==================================================================================================
