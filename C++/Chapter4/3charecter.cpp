#include <iostream>
using namespace std;
int main(){
    int n=4;
    for(int i=0;i<=n-1;i++){
        char ch = 'A';   //initialised inside loop bcs for each starts with A
        for(int j=0;j<=n-1;j++){
            cout<<ch<<" ";
            ch = ch + 1;   //implicit conversion 65+1=66 =>B
        }
        cout<<endl;
    }
}