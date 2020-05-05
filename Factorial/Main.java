#include<iostream>
using namespace std;
int fact(int a)
{
  if(a>1)
  {
    return a*fact(a-1);
  }
  else 
    return 1;
}
  int main()
{
  int a;
    cin>>a;
    cout<<"The factorial of "<<a<<" is"<<" "<<fact(a);
}