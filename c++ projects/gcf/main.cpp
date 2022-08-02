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
int num1, num2, least, great, divisor, gcf, checkl, checkg;

cout << "GCF Calculator" << endl;
cout << "Input two numbers" << endl << "Number 1: ";
cin >> num1;
cout << "Number 2: ";
cin >> num2;

if (num1<num2){
  least = num1;
  great = num2;
} else {
  least = num2;
  great = num1;
}

for (divisor=1; divisor<=least; divisor++){
  checkl = least%divisor;
  checkg = great%divisor;

  if(checkl==0 && checkg==0){
    gcf = divisor;
  }
}

cout << "The GCF of those two numbers is " << gcf;

return 0;
}


