#include <iostream>
using namespace std;
int main(){
    int n=5;
      int nu = 1;   
    for(int i=0;i<=n-1;i++){
        for(int j=0;j<=n-1;j++){
            cout<<nu<<" ";
            nu = nu + 1;   //implicit conversion 65+1=66 =>B
        }
        cout<<endl;
    }
}