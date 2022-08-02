//===============================================================
// Name        : avg.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Finds the average of the amount of numbers you choose.
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
int denamt, frden;
double avgs, total;

cout << "Average Calculator" << endl ;
cout << "How many numbers are you averaging? ";
cin >> frden;

for (denamt = 1; denamt <= frden; denamt++) {
  cout << "What is number " << denamt << ": ";
  cin >> avgs;
  total = total + avgs;
}

cout << endl << "Amount of numbers averaged: " << frden << endl << "Total of numbers averaged: " << total << endl << "Average: " << total/frden;

//      ^------                             and here                                ------^
return 0;
}


