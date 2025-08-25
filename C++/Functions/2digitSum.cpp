#include <iostream>
using namespace std;

int digitSum(int a){
    int m,r;
    int sum=0;
   
    while(a>0){
         m = a % 10;
         sum = sum + m;
         a = a/10;
    }
    return sum;

}

int main(){
    int n=145;
    int p = digitSum(n);
    cout<<p<<endl;

    return 0;
}