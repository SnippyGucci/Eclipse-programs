//===============================================================
// Name        : rps.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Outputs the numbers the user inputs backward
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
#include <time.h>
using namespace std;

int main() {
	 int backwards[5], counter;

   for (counter=1; counter<=5; counter++) {
     cout << "Please input a number: ";
     cin >> backwards[counter];
   } for (counter=5; counter>=1; counter--) {
     cout << backwards[counter] << ", ";
   }

	return 0;
}