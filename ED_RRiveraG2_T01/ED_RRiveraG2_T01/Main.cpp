#include <iostream>
#include "SecClass.h"
#include "BinClass.h"
#include "SortClass.h"
#include "FetchClass.h"
using namespace std;

int main() {
	SecClass test;
	int buffer;
	int a;
	test.setArray(test.RandArray(10));
	std::cout << ("-----------");
	test.showArray();
	std::cout << ("-----------");
	std::cin >> buffer;
	std::cout << ("-----------");
	std::cin >> a;
	test.showFetch(test.sFetch(a));
	std::cout << ("-----------");
	std::cin >> buffer;

	std::cout << ("-----Binario------");
	BinClass binary;
	binary.setArray(binary.RandArray(10));
	binary.showArray();
	binary.showFetch(binary.bFetch(50));
	binary.showArray();
	std::cin >> buffer;

}
