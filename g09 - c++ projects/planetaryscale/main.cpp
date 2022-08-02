//===============================================================
// Name        : planetaryscale.cpp
// Author      : Vian Miranda
// Version     : v 0.1.0
// Copyright   : Your copyright notice
// Description : Takes your age and weight and converts it to what your age and weight would be on another planet.
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

int age, weight;
char planet;

cout << "Input your age, weight, and the first letter of a planet of your choice to see your age and weight on that planet (NOTE: MERCURY - M MARS - R):";
cin >> age >> weight >> planet;

switch (planet) {
  case 'm':
  case 'M':
    cout << "Age on Mercury: " << age/0.241 << endl << "Weight on Mercury: " << weight*0.38;
    break;
  case 'v':
  case 'V':
    cout << "Age on Venus: " << age/0.615 << endl << "Weight on Venus: " << weight*0.91;
    break;
  case 'e':
  case 'E':
    cout << "Hey, you should already know that!";
    break;
  case 'r':
  case 'R':
    cout << "Age on Mars: " << age/1.88 << endl << "Weight on Mars: " << weight*0.38;
    break;
  case 'j':
  case 'J':
    cout << "Age on Jupiter: " << age/11.9 << endl << "Weight on Jupiter: " << weight*2.36;
    break;
  case 's':
  case 'S':
    cout << "Age on Saturn: " << age/29.5 << endl << "Weight on Saturn: " << weight*0.91;
    break;
  case 'u':
  case 'U':
    cout << "Age on Uranus: " << age/84 << endl << "Weight on Uranus: " << weight*0.89;
    break;
  case 'n':
  case 'N':
    cout << "Age on Pluto: " << age/164.8 << endl << "Weight on Pluto: " << weight*1.12;
    break;
  case 'p':
  case 'P':
    cout << "Age: " << age/248.5 << endl << "Weight: " << weight*0.06;
    break;
  default:
    cout << "Please choose a planet inside our solar system.";
}


//      ^------                             and here                                ------^
return 0;
}


