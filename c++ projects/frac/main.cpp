//===============================================================
// Name        : frac.cpp
// Author      : Vian Miranda
// Version     : v0.1.0
// Copyright   : Your copyright notice
// Description : 
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
double num1, den1, num2, den2, newfrac, frac1, frac2, tot1, tot2, tot3, tot4;
char opp, div;

cout << "Fraction Calculator" << endl;
cout << "Input a fraction:" << endl;
cin >> num1 >> div >> den1 >> opp >> num2 >> div >> den2;




switch (opp) {
  case '*':
    cout << num1 << div << den1 << opp << num2 << div << den2 << " = ";
    if (den1*den2 == 0) {
      cout << "undefined";
    } else {
    cout << num1*num2 << div << den1*den2;
    }
  break;
  case '/':
    cout << num1 << div << den1 << opp << num2 << div << den2 << " = ";
    if (den1*num2 == 0) {
      cout << "undefined";
    } else {
      cout << num1*den2 << div << den1*num2;
    }
  break;
  case '+':
    tot1 = den2*den1;
    tot2 = num1*den2;
    tot3 = num2*den1;
    tot4 = tot2+tot3;
    if (tot1 == 0) {
      cout << "undefined";
    } else {
      cout << num1 << div << den1 << opp << num2 << div << den2 << " = ";
      cout << tot4 << div << tot1;
    }
  break;
  case '-':
    tot1 = den2*den1;
    tot2 = num1*den2;
    tot3 = num2*den1;
    tot4 = tot2-tot3;
    if (tot1 == 0) {
      cout << "undefined";
    } else {
      cout << num1 << div << den1 << opp << num2 << div << den2 << " = ";
      cout << tot4 << div << tot1;
    }
  break;
  default:
    cout << "I don't understand that.";
  break;
}
//      ^------                             and here                                ------^
return 0;
}