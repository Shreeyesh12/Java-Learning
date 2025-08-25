#include <iostream>
using namespace std;

int main(){
    int a=4;
    int b=8;
    cout<<"a AND b = "<<(a&b)<<endl;
    cout<<"a OR b = "<<(a|b)<<endl;
    cout<<"a XOR b = "<<(a^b)<<endl;
    cout<<(b << 2)<<endl; //Bitwise left shift
    cout<<(10 >> 1)<<endl;  //Bitwise right shift
    return 0;
}