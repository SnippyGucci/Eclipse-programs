//===============================================================
// Name        : die_roller.cpp
// Author      : Vian Miranda
// Version     :
// Copyright   : Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
#include <time.h>
using namespace std;

int main(){
  int out, sides, die, sum, dienum;
	char repeat;

	do{
  	srand(time(NULL)); //seed generator


  	cout << "How many sides is your die? "; //asks the used how many sides (numbers chosen between 1 and number chosen)
  	cin >> sides;
  	cout << "How many die are you rolling? "; //ask the amount of die (used to see how many times the die needs to be rolled)
  	cin >> die;

		//repeats for looped until the desired amount of dice are rolled.
  	for (dienum=1;die>=dienum;dienum++) {
   	 	out = rand()%(sides)+1;
    	cout << "d" << dienum << ": " << out << " | ";
    	sum = sum+out;
  	}

  	cout << endl << "The total is " << sum << endl; //gives the total of the faces
		cout << "The average of the rolls is " << sum/die << endl;

		cout << endl << "Do you want to roll another die? (y/n)"; //asks the user if they want to roll another die
		cin >> repeat;

		sum = 0; //resets the value of sum
	} while (repeat == 'y');


return 0;
}