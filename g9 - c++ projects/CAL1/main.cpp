//===============================================================
// Name        : CAL1.cpp
// Author      : Vian Miranda
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
 {
	int days, daysplus, daysseen, weeks, weeksplus;

	weeksplus = 0;
	daysplus = 0;
	daysseen = 0;

	/*cout << "What month do you want to output (input ";
	cin >> month;*/
	cout << "How many days are in this month? ";
	cin >> days;
	weeks=days/7;

	cout << setw(5) << "S" << setw(5) << "M" << setw(5) << "T" << setw(5) << "W" << setw(5) << "Th" << setw(5) << "F" << setw(5) << "S" << endl;


	while (weeksplus<weeks+1) {
		while (daysplus<7 && daysseen<days) {
			daysplus++;
			daysseen++;
			cout << setw(5) << daysseen;
		}
		cout << endl;
		weeksplus++;
		daysplus=0;
	}

return 0;
}


