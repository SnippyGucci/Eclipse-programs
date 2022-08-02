//===============================================================
// Name        :reducto.cpp
// Author      :Vian Miranda
// Version     :v.0.1.0
// Copyright   :Your copyright notice
// Description :Reduces fractions
//Started from N.Olah Classroom template - the template is free to use by anyone!
//===============================================================

#include <iostream>
using namespace std;

int num, den, numnew, dennew, checkl, checkg, divisor, gcf, small, large;

int smaller();
int reducto();

int main() {
  cout << "Input your numerator: ";
	cin >> num; 
	cout << "Input your denominator: ";
	cin >> den;

	smaller();
	reducto();

	cout << "Your reduced fraction is " << numnew << "/" << dennew;
}

int smaller(){
	if (num>den) {
		small = num;
		large = den;
	} else {
		small = num;
		large = den;
	}
	return small;
	return large;
}

int reducto(){
	for (divisor=1; divisor<=small; divisor++){
  	checkl = small%divisor;
  	checkg = large%divisor;

  	if(checkl==0 && checkg==0){
   		gcf = divisor;
  	}
	}
	numnew = small/gcf;
	dennew = large/gcf;
	return numnew/dennew;
}