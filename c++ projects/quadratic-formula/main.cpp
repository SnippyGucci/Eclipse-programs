//===============================================================
// Author      : Vian Miranda
// Description : Uses the numbers in the quadratic formula
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
//#include <iomanip>
#include <cmath>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
double quad1, quad2, quad3;
double divdiv, disc;

cout << "Please input 3 numbers:" << endl;

cout << "Number a: ";
cin >> quad1;

cout << "Number b: ";
cin >> quad2;

cout << "Number c: ";
cin >> quad3;

disc = pow(quad2, 2)-(4*quad1*quad3);
//cout << disc << endl;

if (disc < 0) {
  cout << "Please input different numbers.";
} else {
  divdiv = sqrt(disc);
  //cout << divdiv << endl;
  cout << (-quad2 + divdiv)/2*quad1 << endl;
  cout << (-quad2 - divdiv)/2*quad1;
}

/*divdiv = sqrt(disc);
cout << (quad2 + divdiv)/2*quad1 << endl;
cout << (quad2 - divdiv)/2*quad1;*/


//      ^------                             and here                                ------^
return 0;
}


