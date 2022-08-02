//===============================================================
// Name        : AMORT.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Amortization chart
//===============================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main()
 {
int mon;
double interest, prin, owe, pay, intnew;

mon=1;

cout << fixed << setprecision(2);

cout << endl << "Amortization Chart" << endl << "Input money owed: ";
cin >> owe;
cout << "Input annual interest (as a whole number): ";
cin >> interest;
interest = interest/1200;
cout << "Input money paid monthly (min. of $" << (owe*interest)+10 << "):";
cin >> pay;
cout << endl;

cout << setw(5) << "Month" << " | "; 
cout << setw(16) << "Interest" << " | "; 
cout << setw(16) << "Principle" << " | "; 
cout << setw(17) << "Balance" << endl;

do {
  if(owe>prin){
    intnew = (interest)*owe;
    prin = pay-intnew;
    owe = owe-prin;
  
    cout << setw(5) << noshowpoint << fixed << setprecision(2) << mon << " | "; 
    cout << setw(10) << "$ " << setw(8) << intnew; 
    cout << setw(10) << "$ " << setw(8) << prin; 
    cout << setw(10) << "$ " << setw(7) << owe << endl;

    mon++;
  } else {
    prin = owe;
    owe = 0;

    cout << setw(5) << noshowpoint << fixed << setprecision(2) << mon << " | "; 
    cout << setw(10) << "$ " << setw(8) << intnew; 
    cout << setw(10) << "$ " << setw(8) << prin; 
    cout << setw(10) << "$ " << setw(7) << owe << endl;
  }
} while (owe>prin);

intnew = (interest)*owe;
prin = owe+intnew;
owe = 0;

cout << setw(5) << noshowpoint << fixed << setprecision(2) << mon << " | "; 
cout << setw(10) << "$ " << setw(8) << intnew; 
cout << setw(10) << "$ " << setw(8) << prin; 
cout << setw(10) << "$ " << setw(7) << owe << endl;

return 0;
}