#pragma once
class SortClass
{
public:
	SortClass();
	void selection(int* &a);
	void insertion(int* &a);
	void bubble(int* a);
	void quickSort(int* a,int i,int f);
	void mergeSort(int* a,int e,int b);
	void merge(int* a, int c, int b, int medio);
};

