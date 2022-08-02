//===============================================================
// Author      : Vian Miranda
// Description : Calculates the total cost according to the weight and the cost per pound
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main()
 {
   string item;
   double weight;
   double clb;

//      v------ The code for your MAIN() goes between here  ------v
 cout << setw(40) << "YeloMart Price Calculator" << endl << endl;
 
 cout << fixed << showpoint;

 cout << "Enter the item name:";
 cin >> item;

 cout << "Enter the weight of the item:";
 cin >> weight;

 cout << "Enter the cost per pound:";
 cin >> clb;

 cout << endl << setw(10) << "ITEM" << setw(15) << "WEIGHT" << setw(15) << "COST/lb" << setw(15) << "COST" << endl;
 cout << setprecision(1) << setw(10) << item << setw(11) << weight << setw(3) << " lbs" << setprecision(2) << setw(8) << "$" << setw(7) << clb << setw(8) << "$" << setw(7) << weight*clb << endl;
 
//      ^------                             and here                                ------^
return 0;
}