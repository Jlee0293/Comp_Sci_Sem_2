// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char symbol;
int y = 0;
int i = 2;
int count = 0;
cout<<"Enter a Symbol"<<endl;;
cin >> symbol;
while(true)
{
	y=y+1;
	gotoxy(1,i+y);
	cout<<" "<<endl;
	cout<<symbol<<endl;
	sleep(1);

count = count +1;
}
}