#include "SortClass.h"



SortClass::SortClass()
{
}

void SortClass::selection(int * &a)
{
	for (int i = 0;i<(sizeof(a) / 4);i++) {
		int menor = i;
		for (int j = i + 1;j<(sizeof(a) / 4);j++) {
			if (a[j]<a[menor]) {
				menor = j;
			}
		}
		int auxiliar = a[i];
		a[i] = a[menor];
		a[menor] = auxiliar;
	}
}

void SortClass::insertion(int * &a) {
	int temp;
	int j;
	for (int i = 1;i < (sizeof(a) / 4);i++) {
		temp = a[i];
		j = i - 1;
		while ((j >= 0) && (a[j] > temp)) {
			a[j + 1] = a[j];
			j--;
		}
		a[j + 1] = temp;
	}
}

void SortClass::bubble(int * a){
	for (int i = 1;i<10;i++) {
		for (int j = 0;j<9;j++) {
			if (a[j]>a[j + 1]) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	}
}

void SortClass::quickSort(int * a, int i, int f){
	int b, j, pivot;
	b = i; j = f;
	pivot = a[(i + j) / 2];
	do {
		while (a[i]<pivot) {
			b++;
		}
		while (a[j]>pivot) {
			j--;
		}
		if (b <= j) {
			int temp = a[j];
			a[j] = a[b];
			a[b] = temp;
			b++; j--;
		}
	} while (b <= j);
	if (i<j) {
		quickSort(a,i, j);
	}
	if (b<f) {
		quickSort(a,b, f);
	}
}

void SortClass::mergeSort(int * a, int e, int b){
	if (e < b)
	{
		int pivot = (e + b) / 2;

		mergeSort(a,e, pivot);
		mergeSort(a,pivot + 1, b);

		merge(a,e,b, pivot);
	}
}

void SortClass::merge(int * a, int c, int b, int pivot){
	int n1 = pivot - c + 1;
	int n2 = b - pivot;

	int* L = new int[n1];
	int* R = new int[n2];

	for (int i = 0; i<n1; ++i)
		L[i] = a[c + i];
	for (int j = 0; j<n2; ++j)
		R[j] = a[pivot + 1 + j];

	int i = 0, j = 0;

	int k = c;
	while (i < n1 && j < n2)
	{
		if (L[i] <= R[j])
		{
			a[k] = L[i];
			i++;
		}
		else
		{
			a[k] = R[j];
			j++;
		}
		k++;
	}
	while (i < n1)
	{
		a[k] = L[i];
		i++;
		k++;
	}
	while (j < n2)
	{
		a[k] = R[j];
		j++;
		k++;
	}
}
