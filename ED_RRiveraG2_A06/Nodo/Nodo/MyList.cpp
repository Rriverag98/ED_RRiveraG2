#include "MyList.h"
#include "Nodo.h"



MyList::MyList()
{
	first = last = pointer = nullptr;
}

MyList::MyList(int n)
{
	Nodo *node = new Nodo(n);
	first = last = node;
	node->siguiente = nullptr;
}

void MyList::insertFirst(int n)
{
	Nodo *node = new Nodo(n);
	if (isEmpty()) { //Lista vacia
		first = last = node;
		node->siguiente = nullptr;
	}
	else { //Lista con elementos
		node->siguiente = first;
		first = node;

	}
}

void MyList::insertLast(int n)
{
	Nodo *node = new Nodo(n);
	if (isEmpty()) { //Lista vacia
		first = last = node;
		node->siguiente = nullptr;
	}
	else { //Lista con elementos
		last->siguiente = last = node;
	}
}

void MyList::deleteFirst()
{
	if (!isEmpty()) {
		if (first->siguiente == nullptr) { //Si la lista solo tiene un elemento
			first = last = nullptr;
		}
		else { //Si la lista tiene mas de un elemento
			first = first->siguiente;
		}
	}
}

void MyList::deleteLast()
{
	if (!isEmpty()) {
		if (first == last) { //Si la lista solo tiene un elemento
			first = last = nullptr;
		}
		else { //Si la lista tiene mas de un elemento
			pointer = first;
			while (pointer->siguiente != last) { //Recorremos el arreglo hasta que pointer.next es last
				pointer = pointer->siguiente;
			}
			last = pointer;
			last->siguiente = pointer = nullptr;
		}
	}
}

void MyList::deleteNode()
{
}

void MyList::showNode()
{
}

bool MyList::isEmpty()
{
	return false;
}
