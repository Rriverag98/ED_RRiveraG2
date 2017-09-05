#include "FetchClass.h"
#include "time.h"
#include <stdlib.h> 
#include <iostream>


FetchClass::FetchClass()
{
}

void FetchClass::f()
{
}

void FetchClass::setArray(int* a) {
	myArray = a;
}

void FetchClass::showArray()
{
	for (int i = 0;i<=9;i++) {
		std::cout << myArray[i];
		std::cout << "[" << i << "]";
	}
}

void FetchClass::showFetch(int position)
{
	if (position == -1) {
		std::cout << ("El numero no existe en el arreglo");
	}
	else {
		std::cout << ("Si existe");
	}
}

void FetchClass::showArray(int* a)
{
	for (int i = 0;i <9;i++) {
		std::cout << a[i];
	}
}

int* FetchClass::getArray()
{
	return myArray;
}

int* FetchClass::RandArray(int size)
{
	srand(time(NULL));
	int* myArray = new int [size];
	for (int i = 0;i<size;i++) {
		myArray[i] = rand() % 100;
	}

	return myArray;
}
