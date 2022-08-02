//===============================================================
// Name        :         .cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

double sideab, sideac, sidebc;

cout << "Please input 3 lengths:" << endl;

cout << "Side AB: ";
cin >> sideab;

cout << "Side AC: ";
cin >> sideac;

cout << "Side BC: ";
cin >> sidebc;

if (sideab == sideac && sideac == sidebc) {
  cout << "This triangle is equilateral & isosceles";
} else if (sideab == sideac || sideab == sidebc || sideac == sidebc) { 
  cout << "This triangle is isosceles";
} else {
  cout << "This triangle is scalene";
}

//      ^------                             and here                                ------^
return 0;
}


