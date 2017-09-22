#include "NodeDL.h"
#include <String>

template <typename T> class NodeDL{
public:
	NodeDL();
	NodeDL* next;
	NodeDL* back;

	NodeDL() {
		data = d;
		next = nullptr;
		back = nullptr;
	}
};
