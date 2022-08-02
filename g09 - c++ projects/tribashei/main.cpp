//===============================================================
// Author      : Vian Miranda
// Description : Finds the area of a triangle the numbers the user inputs
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

double base;
double height;
string unit;

cout << "Please input a number for the base of your triangle with an unit:" << endl;

cin >> base;

cout << "Please input a number for the height of your triangle with an unit:" << endl;

cin >> height;

cout << "What unit is are your sides in?" << endl;

cin >> unit;

cout << "A triangle with the base of " << base << " and a height of " << height << " has an area of: " << (height*base)/2 << " " << unit << "^2";


//      ^------                             and here                                ------^
return 0;
}


