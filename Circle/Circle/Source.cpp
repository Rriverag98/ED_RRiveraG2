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
	AP p;
	AP a;
public:
	AP getP(void);
	AP getA(void);
	int getR(void);
	void setP(AP p);
	void setA(AP a);
	void setR(int r);
	C(int rad, AP per, AP area);
	C(int rad, AP per);
	C(int rad, AP area);
	C(AP per, AP area);
	C(int rad);
	C(AP per);
	C(AP area);
	C();
}

C::C(int rad, AP per, AP area)
{
	r = rad;
	p = per;
	a = area;
}

C::C(int rad, AP per) {
	r = rad;
	p = per;
}

C::C(int rad, AP area) {
	r = rad;
	a = area;
}

C::C(AP per, AP area) {
	p = per;
	a = area;
}

C::C(int rad) {
	r = rad;
}

C::C(AP per) {
	p = per;
}

C::C(AP area) {
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

void C::setP(AP per) {
	p = per;

}

AP C::getP() {
	return p;
}

void C::setA(AP area) {
	a = area;

}

AP C::getA() {
	return a;
}


