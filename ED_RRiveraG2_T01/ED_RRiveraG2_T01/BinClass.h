#pragma once
#include "FetchClass.h"
#include "SortClass.h"

class BinClass : public FetchClass, public SortClass
{
public:
	BinClass();
	int bFetch(int e);
	static int bFetch(int* &a, int e);
};

