#include <iostream>
using namespace std;

int sum(int a, int b){
    int p = a+b;
    return p;
}

int minOfTwoNum(int a, int b, int c){
    if(a<b && a<c){
        return a;
    }
    else if(b<a && b<c){
        return b;
    }else{
        return c;

    }
        
    
}

int main(){
    int x = sum(2,4);
    cout<<x;
    cout<<endl;
    int y = sum(-3,5);
    cout<<y<<endl;

    int min = minOfTwoNum(8,4,1);
    cout<<"minimum Num is : "<<min<<endl;
    return 0;
}