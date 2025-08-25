#include <iostream>
using namespace std;

int deciToBinary(int decNum){
    int pow=1;
    int ans=0;
   
    while(decNum>0){
         int rem = decNum % 2;     //calculate the remainder
         ans = ans + (rem*pow);
         decNum = decNum/2; //devinding the actual number to next iteration
         pow=pow*10;
    }
    return ans;

}

int main(){
    for(int i=1;i<10;i++){
        cout<<deciToBinary(i)<<endl;

    }
    

    return 0;
}