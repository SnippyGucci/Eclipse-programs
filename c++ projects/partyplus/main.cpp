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

int adult;
int child;
double cpawd;
double cpcwd;
double cpd;
double rf;
double ttr;
double total;
double ld;
double tottotal;

cout << fixed << showpoint;
cout << setw(60) << "Codebusters Party Plus" << endl << setw(54) << "Final Bill" << endl;

cout << setw(45) << "Number of adults:" << setw(15) << "";
cin >> adult;
cout << setw(45) << "Number of children:" << setw(15) << "";
cin >> child;
cout << setw(45) << "Cost per adult without dessert:" << setw(5) << "$" << setw(10) << "";
cin >> cpawd;
cpcwd = cpawd*0.6;
cout << setprecision(2) << setw(46) << "Cost per child without dessert: "  << setw(4) << "$" << setw(15) << cpcwd << endl;
cout << setw(45) << "Cost per dessert:" << setw(5) << "$" << setw(10) << "";
cin >> cpd;
cout << setw(45) << "Room fee:" << setw(5) << "$" << setw(10) << "";
cin >> rf;
cout << setw(45) << "Tip and tax rate:" << setw(5) << "$" << setw(10) << "";
cin >> ttr;
cout << setw(45) << "Less Deposit:" << setw(5) << "$" << setw(10) << "";
cin >> ld;

cout << endl << setw(45) << "Total cost for adult meals:" << setw(5) << "$" << setw(14) << cpawd*adult << endl;;
cout << setw(45) << "Total cost for child meals:" << setw(5) << "$" << setw(14) << cpcwd*child << endl;
cout << setw(45) << "Total cost for dessert:" << setw(5) << "$" << setw(14) << (adult+child)*cpd << endl;
total = (cpawd*adult)+(cpcwd*child)+((adult+child)*cpd);
cout << setw(45) << "Total food cost:" << setw(5) << "$" << setw(14) << total << endl;
cout << setw(45) << "Plus tip and tax:" << setw(5) << "$" << setw(14) << total*ttr << endl;
cout << setw(45) << "Plus room fee:" << setw(5) << "$" << setw(14) << rf << endl;
tottotal = total*ttr+total+rf;
cout << setw(64) << "---------" << endl;
cout << setw(45) << "Total:" << setw(5) << "$" << setw(14) << tottotal << endl;
cout << setw(64) << "---------" << endl;
cout << setw(45) << "Balance Due:" << setw(5) << "$" << setw(14) << tottotal-ld;



//      ^------                             and here                                ------^
return 0;
}


