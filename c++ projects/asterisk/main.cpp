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
int spaces;
spaces = 1;

while (spaces <= 6) {
  cout << setw(spaces) << "*" << endl;
  spaces++;
}

//      ^------                             and here                                ------^
return 0;
}


