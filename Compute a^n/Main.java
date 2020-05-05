#include<iostream>
using namespace std;
int power(int a,int b)
{
  if(b!=0)
    return (a*power(a,b-1));
  else
    return 1;
}
int main()
{
  int a,b,s;
  cin>>a>>b;
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  s=power(a,b);
  cout<<"The value of "<<a<<" power "<<b<<" is"<<" "<<s;
}

  
