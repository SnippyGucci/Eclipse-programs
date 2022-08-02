//===============================================================
// Name        : CAL2.cpp
// Author      : Vian Miranda
// Version     : v.1.1.0
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
	int days, daysplus, daysseen, weeks, weeksplus, month, pushback, pb, pbk, year;

	weeksplus = 0;
	daysplus = 0;
	daysseen = 0;

	cout << "What month do you want to output (please output the month in numeral form)? ";
	cin >> month;
	/*cout << "How many days are in this month? ";
	cin >> days;*/
	cout << "What year do you want to output? ";
	cin >> year;
	cout << "What day is the first day of the month on (Sunday-1; Saturday-7)? ";
	cin >> pushback;
	cout << endl;

	switch (month) {
		case 1:
			cout << setw(22) << "January " << year << endl;
			days = 31;
			break;
		case 2:
			cout << setw(22) << "February " << year << endl;
			if (year%4==0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 3:
			cout << setw(22) << "March " << year << endl;
			days = 31;
			break;
		case 4:
			cout << setw(22) << "April " << year << endl;
			days = 30;
			break;
		case 5:
			cout << setw(22) << "May " << year << endl;
			days = 31;
			break;
		case 6:
			cout << setw(22) << "June " << year << endl;
			days = 30;
			break;
		case 7:
			cout << setw(22) << "July " << year << endl;
			days = 31;
			break;
		case 8:
			cout << setw(22) << "August " << year << endl;
			days = 31;
			break;
		case 9:
			cout << setw(22) << "September " << year << endl;
			days = 30;
			break;
		case 10:
			cout << setw(22) << "October " << year << endl;
			days = 31;
			break;
		case 11:
			cout << setw(22) << "November " << year << endl;
			days = 30;
			break;
		case 12:
			cout << setw(22) << "December " << year << endl;
			days = 31;
			break;
		default:
			cout << "Please enter a valid month" << endl;
	}

	pb = pushback;
	weeks=days/7+2;

	cout << setw(5) << "S" << setw(5) << "M" << setw(5) << "T" << setw(5) << "W" << setw(5) << "Th" << setw(5) << "F" << setw(5) << "S" << endl;


	while (weeksplus<weeks) {
		while (daysplus<7 && daysseen<days+pb-1) {
			daysplus++;
			daysseen++;
			pbk = daysseen-pb+1;
			if (pbk > 0) {
				cout << setw(5*pushback) << pbk;
				pushback = 1;
			}
		}
		cout << endl;
		weeksplus++;
		daysplus=0;
	}

return 0;
}