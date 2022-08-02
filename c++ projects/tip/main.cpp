//===============================================================
// Name        : tip.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Finds the tip from a given amount
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
double amount;
char choice;

cout << fixed << showpoint;

cout << "Please input an amount and a tip choice (good/standard/bad) to calculate the amount your tip will come out to be" << endl;
cout << "Amount: $";
cin >> amount;
cout << "Tip choince (g/s/b): ";
cin >> choice;

if (choice == 'g' || choice == 'G') {
  cout << setprecision(2) << "Your tip amount will be $" <<  amount*0.2;
} else { 
    if (choice == 'b' || choice == 'B') {
      cout << setprecision(2) << "Your tip amount will be $" << amount*0.1;
  } else {
      cout << setprecision(2) << "Your tip amount will be $" << amount*0.15;
  }
}


//      ^------                             and here                                ------^
return 0;
}


