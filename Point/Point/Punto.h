#pragma once
#include <string>
#include <iostream>
using namespace std;

class P {
private:
	string dim;
	int x, y, z;
public:
	void setX(int x);
	int getX(void);
	void setY(int y);
	int getY(void);
	void setZ(int z);
	int getZ(void);
	void setDim(string dim);
	string getDim(void);
	P(int coorx, int coory, int coorz);
	P(int coorx, int coory);
	P();

}

P::P(int coorx, int coory, int coorz) {
	x = coorx;
	y = coory;
	z = coorz;
	dim = "3 dimensiones";
}

P::P(int coorx, int coory) {
	x = coorx;
	y = coory;
	dim = "2 dimensiones";
}

P::P() {
	x = 0;
	y = 0;
	z = 0;
	dim = "Sin dimensiones";
}

void P::setX(int coorx) {
	x = coorx;

}

int P::getX() {
	return x;
}

void P::setY(int coory) {
	y = coory;

}

int P::getY() {
	return y;
}

void P::setZ(int coorz) {
	z = coorz;

}

int P::getZ() {
	return z;
}

void P::setDim(string dim) {
	dim = dim;

}

string P::getDim() {
	return dim;
}