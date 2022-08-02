//===============================================================
// Name        :         .cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
double num1, num2, tot;

cout << "Input your first number to be added:" << endl;
cin >> num2;

do {
  num1=num1+num2;
  cout << "Input your next number to be added:" << endl;
  cin >> num2;
  if (num2<0){
    cout << endl << "Your sum is " << num1; 
  }
} while(num1>=0 && num2>=0);

//      ^------                             and here                                ------^
return 0;
}


