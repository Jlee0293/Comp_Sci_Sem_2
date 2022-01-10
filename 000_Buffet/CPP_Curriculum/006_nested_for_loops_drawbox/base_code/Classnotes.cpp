// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char symbol;
int length = 0;
int width = 0;
int x1 = 0;
int y1 = 0;
cout<<"Please insert a symbol.";
cin>>symbol;
cout<<"Please insert a number for your length.";
cin>>length;
cout<<"please insert a number for your width";
cin>>width;
cout<<"Please input a number";
cin>>x1;
cout<<"Please insert another number";
cin>>y1;
for(int x = 0; x< width; x++ )
{
	for(int y=0; y<length;y++)
	{
	gotoxy(x+x1,y+6+y1);
	cout<<symbol;
}

}
}