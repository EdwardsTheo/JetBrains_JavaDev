String s = "Hi, all";

int len = s.length(); // the len is 7

char theFirstChar = s.charAt(0);  // 'H' has the index 0

char theFifthChar = s.charAt(4); // 'a' has the index 4

char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6


isEmpty() returns true if the string is empty, otherwise – false;
toUpperCase() returns a new string in uppercase;
toLowerCase() returns a new string in lowercase;
startsWith(prefix) returns true if the string starts with the given string prefix, otherwise, false;
endsWith(suffix) returns true if the string ends with the given string suffix, otherwise, false.
contains(...) returns true if the string contains the given string or character;
substring(beginIndex, endIndex) returns a substring of the string in the range: beginIndex, endIndex - 1;
replace(old, new) returns a new string obtained by replacing all occurrences of old with new that can be chars or strings.
trim() returns a copy of the string obtained by omitting the leading and trailing whitespace. Note that whitespace includes not only the space character, but mostly everything that looks empty: tab, carriage return, newline character, etc.

// concatenation using the concat method 
String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith 