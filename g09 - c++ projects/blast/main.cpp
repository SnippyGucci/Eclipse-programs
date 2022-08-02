//===============================================================
// Name        : blast.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v
int timer;

cout << "How many seconds till blastoff? ";
cin >> timer;

for (timer = timer; timer > 0; timer--) {
  cout << "T-" << timer << " seconds" << endl;
}
cout << "BLAST OFF!!!";


//      ^------                             and here                                ------^
return 0;
}


