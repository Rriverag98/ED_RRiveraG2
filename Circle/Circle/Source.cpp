#include <iostream>
using namespace std;

class AP {
protected:
	int a, p;
public:
	int getP(void);
	int getA(void);
	void setP(int p);
	void setA(int a);
};

void AP::setP(int per) {
	p = per;

}

int AP::getP() {
	return p;
}

void AP::setA(int area) {
	a = area;

}

int AP::getA() {
	return a;
}

class C :public AP {
private:
	int r;
public:
	int getP(void);
	int getA(void);
	int getR(void);
	void setP(int p);
	void setA(int a);
	void setR(int r);
	C(int rad, int per, int area);
	C(int rad, int per);
	C(int rad, int area);
	C(int per, int area);
	C(int rad);
	C(int per);
	C(int area);
	C();
}

C::C(int rad, int per, int area)
{
	r = rad;
	p = per;
	a = area;
}

C::C(int rad, int per) {
	r = rad;
	p = per;
}

C::C(int rad, int area) {
	r = rad;
	a = area;
}

C::C(int per, int area) {
	p = per;
	a = area;
}

C::C(int rad) {
	r = rad;
}

C::C(int per) {
	p = per;
}

C::C(int area) {
	a = area;
}
C::C() {
}

void C::setR(int rad) {
	r = rad;

}

int C::getR() {
	return r;
}

void C::setP(int per) {
	p = per;

}

int C::getP() {
	return p;
}

void C::setA(int area) {
	a = area;

}

int C::getA() {
	return a;
}


