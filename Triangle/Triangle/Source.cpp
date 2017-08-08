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

class T :public AP {
private:
	int r, b, alt, h, s, cs, t;
	AP p;
	AP a;
public:
	AP getP(void);
	AP getA(void);
	int getR(void);
	int getB(void);
	int getAlt(void);
	int getH(void);
	int getS(void);
	int getCs(void);
	int getT(void);
	void setP(AP p);
	void setA(AP a);
	void setR(int r);
	void setB(int b);
	void setAlt(int alt);
	void setH(int h);
	void setS(int s);
	void setCs(int cs);
	void setT(int t);
	T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP per, AP area);
	T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP per);
	T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP area);
	T(int rad, int base, int hip, int alt, int sen, int csen, int tan);
	T();
}

T::T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP per, AP area)
{
	r = rad;
	b = base;
	this->alt = alt;
	s = sen;
	cs = csen;
	p = per;
	a = area;
	t = tan;
}

T::T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP per) {
	r = rad;
	p = per;
}

T::T(int rad, int base, int hip, int alt, int sen, int csen, int tan, AP area) {
	r = rad;
	a = area;
}

T::T(int rad, int base, int hip, int alt, int sen, int csen, int tan) {
	
}

T::T() {
	
}


void T::setP(AP per) {
	p = per;

}

AP T::getP() {
	return p;
}

void T::setA(AP area) {
	a = area;

}

AP T::getA() {
	return a;
}

void T::setR(int rad) {
	r = rad;

}

int T::getR() {
	return r;
}

void T::setB(int base) {
	r = base;

}

int T::getB() {
	return b;
}

void T::setAlt(int alt) {
	this->alt = alt;

}

int T::getAlt() {
	return alt;
}

void T::setH(int hip) {
	h = hip;

}

int T::getH() {
	return h;

}
void T::setS(int sen) {
	s = sen;

}

int T::getS() {
	return s;

}
void T::setCs(int Csen) {
	cs = Csen;

}

int T::getCs() {
	return cs;

}
void T::setT(int tan) {
	t = tan;

}

int T::getT() {
	return t;

}

