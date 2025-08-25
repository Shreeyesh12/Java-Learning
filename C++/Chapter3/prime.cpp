/*
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n <= 1) {
        cout << "The number " << n << " is not prime." << endl;
        return 0;
    }

    int count = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        cout << "The number " << n << " is prime." << endl;
    } else {
        cout << "The number " << n << " is not prime." << endl;
    }

    return 0;
}
2nd approach :

*/
// #include <iostream>
// using namespace std;
// int main(){
//     int n=12;
//     int count=0;
//     for(int i=2; i*i <= n; i++){
//         //took i*i bcs 
//         if(n%i == 0){
//             count++;
//             break;
//             } 
//     }
//     if(count==0){
//                 cout<<"the number "<<n<<" is  prime "<<endl;
//             }
//             else{
//                 cout<<"The number "<<n<<" is  not prime"<<endl;
//             }
    
//     return 0;
// }

#include <iostream>
using namespace std;
int main(){
    int n=13;
    bool isPrime = true;
    for(int i=2; i*i <= n; i++){
        //took i*i bcs 
        if(n%i == 0){
            isPrime=false;
            break;
            } 
    }
    if(isPrime == true){
                cout<<"the number "<<n<<" is  prime "<<endl;
            }
            else{
                cout<<"The number "<<n<<" is  not prime"<<endl;
            }
    
    return 0;
}

