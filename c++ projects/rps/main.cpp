//===============================================================
// Name        : rps.cpp
// Author      : Vian Miranda
// Version     : v.0.1.0
// Copyright   : Your copyright notice
// Description : Rock-Paper-Scissors
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
#include <cmath>
#include <time.h>
using namespace std;

int main()
 {
	 int choice, cpuchoice, win, cpuwin;
	 int rpsposs = 3;
	 
	 win = 0;
	 cpuwin = 0;

	do {
		do{
			cout << "Input your choice (rock - 1; paper - 2; scissor - 3): ";
			cin >> choice;
			
			//outputs what you chose
			if (choice == 1){ 
				cout << "You chose Rock" << endl;
			} if (choice == 2){
				cout << "You chose Paper" << endl;
			} if (choice == 3){
				cout << "You chose Scissors" << endl;
			}

			srand(time(NULL)); //seed

			if (choice > 3 || choice < 1) {
				cout << "Please input a valid number" << endl << endl;
			}
		} while (choice > 3 || choice < 1); //loops the choosing process if user chooses an invalid number
		
		//outputs what CPU chose
		if (choice > 0){
			cpuchoice = rand()%(rpsposs)+1;
			if (cpuchoice == 1){
				cout << "CPU chose Rock" << endl;
			} if (cpuchoice == 2){
				cout << "CPU chose Paper" << endl;
			} if (cpuchoice == 3){
				cout << "CPU chose Scissors" << endl;
			}
		} 
		
		//tells if you won or the CPU won
		if (choice == cpuchoice){
			cout << "It's a tie!";
		} else {
			if ((choice < cpuchoice && choice+cpuchoice!=4) || cpuchoice+2==choice){
				cout << "CPU wins!";
				cpuwin++;
			} else { 
				if (choice > cpuchoice || choice+cpuchoice==4){
					cout << "You win!";
					win++;
				}	
			}
		}

		cout << endl << endl << "You have won " << win << "/3" << endl << "CPU has won " << cpuwin << "/3" << endl << endl;
	} while (win < 3 && cpuwin < 3); //does program until one of them has 3 wins

return 0;
}