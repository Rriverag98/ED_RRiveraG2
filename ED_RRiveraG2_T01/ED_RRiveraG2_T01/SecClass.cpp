#include <iostream>
#include "SecClass.h"
#include "FetchClass.h"



SecClass::SecClass(){
}

int SecClass::sFetch(int a){
	for (int i = 0;i<10;i++) {
		if (a == myArray[i]) {
			return 1;
		}
	} return -1;
}

int SecClass::sFetch(int *& a, int e)
{
	return 0;
}


