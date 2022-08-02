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
int num1, num2, least, great, multiple, lcm;

cout << "LCM Calculator" << endl;
do {
  cout << "Input two positive numbers" << endl << "Number 1: ";
  cin >> num1;
  cout << "Number 2: ";
  cin >> num2;
  cout << endl;
} while (!(num1>0 && num2 > 0));

if (num1<num2){
  least = num1;
  great = num2;
} else {
  least = num2;
  great = num1;
}

for (multiple=least*great; multiple>=great; multiple--){
  if(multiple%least==0 && multiple%great==0){
    lcm=multiple;
  }
}

cout << "The LCM of those two numbers is " << lcm;

return 0;
}