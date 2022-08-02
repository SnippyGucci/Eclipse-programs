//===============================================================
// Name        :larger.cpp
// Author      :Vian Miranda
// Version     :v.0.1.0
// Copyright   :Your copyright notice
// Description :
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int num1, num2;
int larger(int num1, int num2);

int main() {
  cout << "Input two numbers: ";
	cin >> num1;
	cin >> num2;

	cout << larger(num1, num2);
}
int larger(int num1, int num2) {
	int large;
	if (num1>num2) {
		large = num1;
	} else {
		large = num2;
	}
	return large;
}