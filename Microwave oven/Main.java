#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d;
  cin>>a>>b;
  d=a*b;
  c=(b*50)/100;
  if(a==2)
  {
    cout<<d-c;
  }
  else if(a==3)
  {
    cout<<2*b;
  }
  else
  {
    cout<<"Number of items is more";
  }
  
}