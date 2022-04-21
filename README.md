# Java-Telephony
Small program written in Java using OOP showcasing usage of Interfaces
Input
The input comes from the console. It will hold two lines:

First line: phone numbers to call (string), separated by spaces.
Second line: sites to visit (string), separated by spaces.
Output
First call all numbers in the order of input then browse all sites in order of input
The functionality of calling phones is printing on the console the number which is being called
If the number is 10 digits long, you are making a call from your smartphone and you print:
Calling... {number}

The functionality of the browser should print on the console the site in format:
Browsing: {site}!

If there is a number in the input of the URLs, print: "Invalid URL!" and continue printing the rest of the URLs.
If there is a character different from a digit in a number, print: "Invalid number!" and continue to the next number.
Constraints:
Each site's URL should consist only of letters and symbols (No digits are allowed in the URL address)
The phone numbers will always be 7 or 10 digits long

Input:

0882134215 0882134333 0899213421 0558123 3333123

http://softuni.bg http://youtube.com http://www.g00gle.com


Output:

Calling... 0882134215

Calling... 0882134333

Calling... 0899213421

Calling... 0558123

Calling... 3333123


Browsing: http://softuni.bg!

Browsing: http://youtube.com!

Invalid URL!
