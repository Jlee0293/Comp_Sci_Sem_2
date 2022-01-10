// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int length = 0;
char a;
char orientation;
cout<< "Please enter any symbol."<<endl;
cin>>a;
cout<<"Please enter line lenght(#)."<<endl;
cin>>length;
cout<<"Horizontal or Vertical?(h or v)"<<endl;
cin>>orientation;
if(orientation=='h')
{
	for(int count =1; count<=length; count = count +1)
	{
	cout<<a;
	}
	}
if(orientation=='v')
{
	for(int count =1; count<=length; count = count +1)
	{
	cout<<a<<endl;
	}
	}
	
}

