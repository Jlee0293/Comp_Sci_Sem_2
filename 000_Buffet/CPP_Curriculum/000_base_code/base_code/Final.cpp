// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
cout<<"               @                   "<<endl;
cout<<"              ***                   "<<endl;
cout<<"             *****                 "<<endl;
cout<<"            **%****                "<<endl;
cout<<"           **********            "<<endl;
cout<<"         **$*******&**               "<<endl;
cout<<"        ********&*******           "<<endl;
cout<<"       *$****%******#****         "<<endl;
cout<<"      ********************       "<<endl;
cout<<"              | |              "<<endl;
cout<<"  ------------|-|-------------"<<endl;
cout<<"--------------------------------"<<endl;
int x =0;
int y=0;

for(int y=0; y<7;y++)
{
	for(int x=0; x<2;x++)
	{
	gotoxy(x+8,y+20);	
	cout<<" * ";
	}
for(int y=0; y<8;y++)
{
	for(int x=0; x<4;x++)
	{
	gotoxy(x+3,y+21);	
	cout<<"-----------";
	cout<<"-----------";
	cout<<"-----";

	}	
}

}

}

	

