//Program to compress Todays Date and decompress 
#include<iostream>
#include<bits/stdc++.h>
#include<iomanip>
#include<cstring>
using namespace std;


//input 26 8 2025
//bits  5  4 11
void CompressDate(int dd,int mm,int yyyy){/// dd=11010,mm=1000,yyyy=11111010101

	
	//Compression
	bitset<32>y(yyyy);
	cout<<"y:"<<y<<endl;
	int a1=dd<<4;  ///11010 0000 
	bitset<32>aa1(a1);
	cout<<"a1:"<<aa1<<endl;
	int b1=a1|mm;///11010 1000
	bitset<32>bb1(b1);
	cout<<"b1:"<<bb1<<endl;
	int a2=b1<<11; // 11010 1000 00000000000
	bitset<32>aa2(a2);
	cout<<"a2:"<<aa2<<endl;
	int b2=a2|yyyy;  //11010 1000 11111101001
	bitset<32>bb2(b2);
	
	//compressed date
	cout<<endl<<"Compressed Date:"<<bb2<<endl;
	cout<<"b2:"<<b2<<endl;	

	//Decompression
	
	int yy=b2&2047;  //11111101001
	int c1=b2>>11;  //11010 1000
	int mm1=c1&15;  //1000
	int dd1=c1>>4;  //11010
	
	cout<<"Decompressed Dates:"<<endl;
	cout<<" dd="<<dd1<<" mm="<<mm1<<" yyyy="<<yy<<endl;
	
	
}
int main()
{
	int day,month,year;
        cout<<"Enter Date:";
	cin>>day;
	cout<<"Enter Month:";
	cin>>month;
	cout<<"Enter Year:";
	cin>>year;
	
	string bin = "11111111111";
	cout<<"binary to dec"<<stoi(bin, 0,2)<<endl;
	
	bitset<32>y(year);
	cout<<"y:"<<y<<endl;
	CompressDate(day,month,year);
	return 0;	
	
}






