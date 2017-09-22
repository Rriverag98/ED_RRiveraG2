#include "DLList.h"
#include "NodeDL.cpp"
#include <iostream>


template <typename T> class DLList {
public:
	NodeDL<T>* first;
	NodeDL<T>* last;
	NodeDL<T>* pointer;
	int length;

	DLList() {
		first = NULL;
		last = NULL;
		back = NULL;
		length = 0;
	}

	DLList(T d) { //Constructor con un primer nodo
		NodeDL<T> node = new NodeDL<T>(d);
		//Apuntamos primero y ultimo al nuevo nodo
		*first = node;
		*last = node;
		//Los apuntadores siguiente y atras apuntan a nulo
		node.next = NULL;
		node.back = NULL;
		//Incrementamos el contador de elementos de la lista
		length++;
	}

	//Metodos
	//Revisar si la lista esta vacia.
	bool isEmpty() {
		return length == 0; //Si el length de la lista es 0 regresa true
	}

	//Insertar al Inicio
	//Escenarios: Lista vacia o Lista con elementos
	void insertFirst(T d) {
		NodeDL<T> node = new NodeDL<T>(d);
		if (isEmpty()) { //Lista vacia?
			*first = node;
			*last = node;
		} else { //Mas de un elemento en la lista
			//El siguiente del nuevo nodo apunta al nodo apuntado por first
			node.next* = first;
			//El nodo que apunta firsy en su apuntador back apunta al nuevo nodo
			first->back = first;
			//el apuntador first apunta al nuevo nodo
			*first = node;
		}
		length++:
	}

	void inserLast(T d) {
		NodeDL<T> node = new NodeDL<T>(d);
		if (isEmpty()) {
			*first = node;
			*last = node;
		} else {
			node.back = last;
			last->next = node;
			*last = node;
		}
		length--;
	}
	void deleteFirst() {
		if (!isEmpty()) {
			if (*first->next = NULL) {
				first = last = NULL;
			} else {
				*first = first->next;
				first->back = NULL;
			}
			length--;
		}
	}

	void deleteLast() {
		if (!isEmpty()) {
			if (first == last) {
				first = last = NULL;
			} else {
				*last = last->back;
				last->next = NULL;
			}
			length--;
		}
	}

	bool deleteNode(T d) {
		pointer = first;
		pointer2 = first->next->next;
		if (!isEmpty()) {
			if (first == last) { //Si la lista tiene un solo elemento
				if (first->data == d) { //revisa si es el elemento buscado
					deleteFirst(); //elimina first
					lenght--;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if (first->data == d) { //revisa si el primer elemento tiene el dato que buscamos
					deleteFirst();
					length--;
					return true;
				}
				else {
					while (pointer->next != NULL) { //Recorremos el arreglo y se detiene si pointer.next es nulo
						if (pointer->next.data == d) { //revisa si el siguiente elemento contiene el elemento que buscamos
							pointer->next = pointer->next->next;
							pointer2->back = pointer2->back->back;
							length--;
							return true
						} else {
						pointer = pointer->next;
						pointer2 = pointer2->next;
						}
					}
					return false;
				}
			}
		}
		return false;
	}

	void showListFL() {
		pointer = first;
		std::cout << ("first->");
		for (int i = 0;i<length;i++) {
			std::cout << ("[" + pointer->data->toString() + "]->");
			pointer = pointer->next;
		}
		std::cout << ("<-last");
	}

	void showListLF() {
		pointer = last;
		std::cout << ("last->");
		for (int i = length;i>0;i--) {
			std::cout << ("[" + pointer->data->toString() + "]->");
			pointer = pointer->next;
		}
		std::cout << ("<-first");
	}


};