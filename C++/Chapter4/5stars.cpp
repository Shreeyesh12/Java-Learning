// #include <iostream>
// using namespace std;

// int main(){
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             cout<<"* ";
//         }
//         cout<<endl;
//     }
// }


#include <iostream>
using namespace std;
int main(){
    int n=4;
      int nu = 1;   
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            cout<<(i+1)<<" ";
            nu = nu + 1;   //implicit conversion 65+1=66 =>B
        }
        cout<<endl;
    }
}