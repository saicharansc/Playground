#include<iostream>
using namespace std;
int main()
{
  int i,a,oddsum=0,evensum=0;
  cin>>a;
  int arr[10];
  for(i=0;i<a;i++)
  {
    cin>>arr[i];
 if(arr[i]%2==0)
  {
    evensum=evensum+arr[i];
 }
    else
    {
      oddsum=oddsum+arr[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<evensum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<oddsum<<endl;
}