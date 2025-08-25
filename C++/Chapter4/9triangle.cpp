// #include <iostream>
// using namespace std;

// int main()
// {
//     int n = 4;
//     char ch = 'A';
//     char p;
//     for (int i = 0; i < n; i++)
//     {
//         for (int j = i + 1; j > 0; j--)
//         {
//             p = ch + j - 1;

//             cout <<p<< " ";
//         }
//         cout << endl;
//     }
    
// }

#include <iostream>
using namespace std;

int main()
{
    int n = 4;
    char ch = 'A';
    char p;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j<i; j++)
        {
            cout<<" ";  
        }
        for(int j=0;j<n-i;j++){
            cout<<i+1;
        }
        cout << endl;
    }
    
}
