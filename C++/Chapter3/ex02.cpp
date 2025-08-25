#include <iostream>
using namespace std;

int main(){

    int oddSum=0;
    int evenSum=0;
    int n=9;
    for(int i=1; i<=n; i++){
        if(i%2 != 0){
            cout<<i<<", ";
            oddSum=oddSum+i;
        }
        else {
            cout<<i<<". ";
            evenSum=evenSum+i;
        }    
    }
    cout<<"oddSum="<<oddSum<<"\n";
    cout<<"evenSum="<<evenSum<<"\n";
    return 0;
}