#include <iostream>
using namespace std;

bool isPoewerOfTwo(int n){
    if(n<=0){
        return false;
    }
    bool x  = (n & (n-1));
    return x==0;
}

int isPowerOfThree(int n){
    if(n<=0){
        return false;
    }

    while(n%3==0){
        n =n/3;
    }
    return n==1;

}

int isPoewerOfFour(int n){
    if(n<=0){
        return false;
    }
    while(n%4==0){
        n = n/4;
    }
    return n==1;
}


int main(){

    cout<<"enter the number : "<<endl;
    int n;
    cin>>n;

    if(isPowerOfThree(n)){
        cout<<"the num is power of 3"<<endl;
    }else{
        cout<<"the number is not power of 3"<<endl;
    }

    if(isPoewerOfTwo(n)){
         cout<<"the num is power of 2"<<endl;
    }else{
        cout<<"the number is not power of 2"<<endl;

    }
    if(isPoewerOfFour(n)){
         cout<<"the num is power of 4"<<endl;
    }else{
        cout<<"the number is not power of 4"<<endl;

    }

    return 0;
}