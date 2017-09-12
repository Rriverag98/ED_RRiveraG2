#pragma once
#include "Nodo.h"
class MyList
{
public:
	MyList();
	MyList(int n);
	void insertFirst(int n);
	void insertLast(int n);
	void deleteFirst();
	void deleteLast();
	void deleteNode();
	void showNode();
	bool isEmpty();
	Nodo *first;
	Nodo *last;
	Nodo *pointer;
	
};

