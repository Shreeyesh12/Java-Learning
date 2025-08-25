#include <iostream>
using namespace std;


int factorial(int a){
    int fact=1;
    for(int i=1;i<=a;i++){
        fact = fact * i;

    }
    return fact;
}

int nCr(int n, int r){

    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nMr = factorial(n-r);

    return fact_n/(fact_r * fact_nMr);

}



int main(){
    int n = 8;
    int r = 2;
    cout<<nCr(8,2)<<endl;

    return 0;
}