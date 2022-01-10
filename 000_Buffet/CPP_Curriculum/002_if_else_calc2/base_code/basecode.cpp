// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x = 0;
	int y = 0;
	int z = 0;
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	
	cout<<"Calculator"<<endl;
	cout<<"Please enter first number."<<endl;
	cin>>x;
	cout<<"Please enter second number."<<endl;
	cin>>y;
	cout<<"Please enter an oporation of the following : 1(add) , 2(subtract) , 3(multiply) , 4(divide) ."<<endl;
	cin>>z;

	if(z==a){
		cout<<x+y<<endl;
	
	}
		else if(z==b){
			cout<<x-y<<endl;
		}
		else if(z==c){
			cout<<x*y<<endl;
		}
		else if (z==d){
			cout<<x/y<<endl;
			
		}
		}
	
