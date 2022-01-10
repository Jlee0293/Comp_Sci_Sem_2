// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x = 0;
	int y = 0;
	char opprand;
	char a;
	cout<<"Calculator"<<endl;
	cout<<"Please enter first number."<<endl;
	cin>>x;
	cout<<"Please enter second number."<<endl;
	cin>>y;
	cout<<"Please enter an opperation (Ex. +,-,*,/)"<<endl;
	cin>>opprand;
while(true)
{
	if(opprand=='+')
	{
		cout<<x+y<<endl;
	}
	else if(opprand=='-')
	{
		cout<<x-y<<endl;
	}
	else if(opprand=='*')
	{
		cout<<x*y<<endl;
	}
	else if (opprand=='/')
	{
		cout<<x/y<<endl;
	}
	cout<<"Would you like to contine?(y or n)"<<endl;
	cin>>a;
		if(a=='y')
	{
	cout<<"Please enter first number."<<endl;
	cin>>x;
	cout<<"Please enter second number."<<endl;
	cin>>y;
	cout<<"Please enter an oporation (Ex. +,-,*,/)"<<endl;
	cin>>opprand;
	if(opprand=='+')
	{
		cout<<x+y<<endl;
	
	}
	else if(opprand=='-')
	{
		cout<<x-y<<endl;
	}
	else if(opprand=='*')
	{
		cout<<x*y<<endl;
	}
	else if (opprand=='/')
	{
		cout<<x/y<<endl;
	}
	}
	if (a=='n')
	{
		break;
	}
}
}