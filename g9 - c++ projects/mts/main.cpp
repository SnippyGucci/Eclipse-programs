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
int space, negspace, adder;
space = 1;
negspace = 10;
adder=0;


while (adder <= 6) {
  if (negspace>=space && adder < 4){
    negspace=negspace-2;
    cout << setw(space+10) << "*" << setw(negspace) << "*" << endl;
    space++;
    adder++;
  }else{
    negspace=negspace+2;
    space=space-1;
    cout << setw(space+9) << "*" << setw(negspace) << "*" << endl;
    adder++;
  }
}

//      ^------                             and here                                ------^
return 0;
}


