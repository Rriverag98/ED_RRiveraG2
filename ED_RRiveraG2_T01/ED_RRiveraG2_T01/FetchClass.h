#pragma once
class FetchClass
{
public:
	FetchClass();
	virtual void f();
	void setArray(int* a);
	void showArray();
	void showFetch(int position);
	void showArray(int* a);
	int* getArray();
	int* RandArray(int size);

protected:
	int* myArray;
};


