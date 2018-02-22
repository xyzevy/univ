#include<iostream>
using namespace std;

void* aligned_malloc(size_t required_bytes, size_t alignment){
    void* p1;
    void** p2;
    int offset = alignment - 1 + sizeof(void*);
    if ((p1 = (void*)malloc(required_bytes + offset)) == NULL){
        return NULL;
    }
    p2 = (void**)(((size_t)(p1)+offset) & ~(alignment - 1));
    p2[-1] = p1;
    return p2;
}

void aligned_free(void *p2){
    void* p1 = ((void**)p2)[-1];
    free(p1);
}

int main(){
	
	int * t = (int*)aligned_malloc(100,4);
	cout<<t<<endl;

}


