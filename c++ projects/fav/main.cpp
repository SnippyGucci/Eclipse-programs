//===============================================================
// Name        :         .cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

int num;

cout << "Type your favorite number (1-10): ";
cin >> num;

switch (num) {
  case 1:
    cout << "You guys tend to always be the best at something.";
  break;
  case 2:
    cout << "You guys are young and go for the fun";
  break;
  case 3:
    cout << "You live a carefree life";
  break;
  case 4:
    cout << "You are kind";
  break;
  case 5:
    cout << "You can command well";
  break;
  case 6:
    cout << "You are liked by others";
  break;
  case 7:
    cout << "You are a follower";
  break;
  case 8:
    cout << "Hmmm... You guys are hard to decipher";
  break;
  case 9:
    cout << "You guys tend to be smart";
  break;
  case 10:
    cout << "You guys tend to be athletic";
  break;
  default:
    cout << "You guys have chosen a forbidden number";
}


//      ^------                             and here                                ------^
return 0;
}


