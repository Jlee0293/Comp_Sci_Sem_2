// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));	
	int loop1 = 5;
	int loop2 = 15;
	
	while(true)
	{ 
	cout<<loop1<<endl;
	if (loop1==25)
		{
			break;
		}
		loop1 = loop1 +1;
	}
	while(true)
	{
	cout<<loop2<<endl;
	if (loop2==5)
		{
			break;
		}
	loop2 = loop2-1;
	}

}
