//===============================================================
// Author      : Vian Miranda
// Description : Finds the area and perimeter of the numbers the user inputs
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

float length;
float width;
cout << "Please input two numbers for the length:" << endl;
cin >> length;
cout << "Please input two numbers for the width:" << endl;
cin >> width;
cout << "A rectangle with the length of " << length << " and a width of " << width << " has a perimeter of: " << 2*length+2*width << endl;
cout << "A rectangle with the length of " << length << " and a width of " << width << " has an area: " << length*width << endl;


//      ^------                             and here                                ------^
return 0;
}


