#include<iostream>
using namespace std;
int main()
{
	int n,k;
	cout<<"Enter a positive interger:";
	cin>>n;
	cout<<"Number "<<n<<" Factors ";
	for(k=1;k<=n;k++)
	{
		if(n%k==0)
			cout<<k<<" ";
	}
	cout<<endl;
}