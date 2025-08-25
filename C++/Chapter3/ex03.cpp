#include <iostream>
using namespace std;

int main(){

    int oddSum=0;
    int evenSum=0;
    int n=9;
    int i=0;
    while(i<=n){
        if(i%2 != 0){
            cout<<i<<", ";
            oddSum=oddSum+i;
            i++;
        }
        else {
            cout<<i<<". ";
            evenSum=evenSum+i;
            i++;
        }    
    }
    cout<<"oddSum="<<oddSum<<"\n";
    cout<<"evenSum="<<evenSum<<"\n";
    return 0;
}