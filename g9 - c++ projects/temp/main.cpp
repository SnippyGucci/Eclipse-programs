//===============================================================
// Author      : 
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
using namespace std;

int main()
 {
   double temp, tofar, tocelc, parfar, parcelc;
   char celfar;


   cout << "Input a temperature: ";
   cin >> temp;

   cout << "What type of temperature unit do you want to convert this to? (please input lower-case letters)(c/f) ";
   cin >> celfar;
   
  if (celfar == 'c') {
    tocelc = (temp-32)*5/9;
    cout << tocelc << "ºC";
  } if (celfar == 'f') {
    tofar = (temp*9/5)+32;
    cout << tofar << "ºF";
  } else {
    cout << "Please input the correct unit";
  }


//      ^------                             and here                                ------^
return 0;
}


