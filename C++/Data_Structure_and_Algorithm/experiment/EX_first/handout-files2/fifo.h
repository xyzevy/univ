#ifndef FIFO_H
#define FIFO_H


#include <queue> 
#include <string> 

using namespace std;
#include "simulator.h"

class fifo: public simulator
{
public:
	fifo(int seconds_per_page);
	void simulate(string file);
	//~fifo();
};

#endif