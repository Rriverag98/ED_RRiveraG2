#include "BinClass.h"



BinClass::BinClass()
{
}

int BinClass::bFetch(int e){
	selection(myArray);
	int b = sizeof(myArray)/4;
	int inicio, centro, fin;
	int valorCentro;
	inicio = 0;
	fin = b - 1;
	while (inicio<fin) {
		centro = (inicio + fin) / 2;
		valorCentro = myArray[centro];
		if (valorCentro == e) {
			return centro;
		}
		if (e<myArray[centro]) {
			fin = centro - 1;
		}
		if (e>myArray[centro]) {
			inicio = centro + 1;
		}
	} return -1;
}

int BinClass::bFetch(int *& a, int e)
{
	return 0;
}

