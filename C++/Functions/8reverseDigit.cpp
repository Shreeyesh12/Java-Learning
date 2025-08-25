#include <iostream>
using namespace std;

int reverseDigit(int n){
    int reversed = 0;
        while(n>0){
            int digit = n % 10;
            reversed = reversed*10 + digit;
            n = n/10;
        }
        return reversed;
}

int main(){
    int num = 121;
    int p=reverseDigit(num);
    if(p==num){
        cout<<"palindromr";
    }else{
        cout<<"not a pali";
    }



}