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

double quad1, quad2, quad3, disc;

cout << "Please input 3 numbers:" << endl;

cout << "a: ";
cin >> quad1;

cout << "b: ";
cin >> quad2;

cout << "c: ";
cin >> quad3;

disc = pow(quad2, 2)-(4*quad1*quad3);

if (disc == 0) {
  cout << "There is only one solution since the discriminant = 0" << endl;
  cout << (-quad2 + sqrt(disc))/2*quad1 << endl;
} if(disc > 0){
  cout << "There are two solutions" << endl;
  cout << (-quad2 + sqrt(disc))/2*quad1 << endl;
  cout << (-quad2 - sqrt(disc))/2*quad1;
} if(disc < 0) {
  cout << "There are no real solutions. Please input some other variables";
}


//      ^------                             and here                                ------^
return 0;
}


