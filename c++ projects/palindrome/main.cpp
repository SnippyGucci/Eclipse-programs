//===============================================================
// Name        : palindrome.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Tells you if the word you inputted is a palindrome
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main() {
  int counter, plus, letter, corr;
  char backwards[15];
  plus = 0;
  corr = 0;
  letter = 0;
 
  cout << "Insert a word to see if it is a palindrome. Please end your word with a period [.]:" << endl;
  cin >> backwards;

  while (backwards[letter] != '.') {
    letter++;
  }

  for (counter=letter; counter>=1; counter--) {
    if (backwards[counter-1]==backwards[plus]) {
      corr++;
    }
    plus++;
  }

  if (corr==letter) { 
    cout << "This word is a palindrome";
  } else {
    cout << "This word is not a palindrome";
  }
return 0;
}