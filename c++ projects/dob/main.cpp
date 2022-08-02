//===============================================================
// Name        :         .cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int main()
 {
//      v------ The code for your MAIN() goes between here  ------v

int mon, numdate, numyr, calc, moncalc, ttl, numyrtwo, ttlttl, ttll, fnl;

cout << "Input your DOB to find out the day you were born on: ";
cin >> mon >> numdate >> numyr;


/*if (numyrtwo % 4 == 0 && numyrtwo > 2000) {
  numyrtwo = (numyr - 1900);
  calc = numyrtwo / 4 + numyrtwo + numdate;
}*/
if (numyr >= 2000) {
  numyrtwo = (numyr - 2000);
  calc = numyrtwo / 4 + numyrtwo + numdate - 1;
} else {
  if (numyr >= 1900) {
    numyrtwo = (numyr - 1900);
    calc = numyrtwo / 4 + numyrtwo + numdate;
  } else {
    numyrtwo = (numyr - 2000);
    calc = numyrtwo / 4 + numyrtwo + numdate;
  }
}

if (mon == 1) {
  moncalc = 1;
} else {
  if(mon == 2) {
    moncalc = 4;
  } else {
    if (mon == 3) {
      moncalc = 4;
    } else {
      if (mon == 4) {
        moncalc = 0;
      } else {
        if (mon == 5) {
          moncalc = 2;
        } else {
          if (mon == 6) {
            moncalc = 5;
         } else {
          if (mon == 7) {
            moncalc = 0;
          } else {
            if (mon == 8) {
              moncalc = 3;
            } else {
              if (mon == 9) {
                moncalc = 6;
              } else {
                if (mon == 10) {
                  moncalc = 1;
                } else {
                  if (mon == 11) {
                    moncalc = 4;
                  } else {
                      moncalc = 6;
                    }
                  }
                }
              }
            }
          }
        }
      } 
    }
  }
}

ttl = moncalc + calc;

if (numyr % 4 == 0 && mon == 1) {
  ttlttl = ttl - 1;
} else {
  if (numyr % 4 == 0 && mon == 2) {
    ttlttl = ttl - 1;
  } else {
    ttll = ttl;
  }
}


fnl = ttll % 7;

//cout << fnl;

if (fnl == 1){
  cout << "You were born on a Sunday";
} else {
  if (fnl == 2) {
    cout << "You were born on a Monday";
  } else {
    if (fnl == 3) {
      cout << "You were born on a Tuesday";
    } else {
      if (fnl == 4) {
        cout << "You were born on a Wednesday";
      } else {
        if (fnl == 5) {
          cout << "You were born on a Thursday";
        } else {
          if (fnl == 6) {
            cout << "You were born on a Friday";
          } else {
            cout << "You were born on a Saturday";
          }
        }
      }
    }
  }
}

//      ^------                             and here                                ------^
return 0;
}


