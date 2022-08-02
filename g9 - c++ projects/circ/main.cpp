//===============================================================
// Author      : Vian Miranda
// Description : Find's the area and circumference from a given radius
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
const double pi = 3.14;
double radius;
cout << "Instructions: Type a number for the radius, and we will output an area and circumference of the circle" << endl;
cin >> radius;
cout << "Circumference: " << 2*pi*radius << endl;
cout << "Area: " << pi*(radius*radius) << endl;

//      ^------                             and here                                ------^
return 0;
}


