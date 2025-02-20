#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while ( t-- > 0) {
        int a;
        char op;
        int b;

        cin>>a;
        cin>>op;
        cin>>b;

        cout<<(a+b)<<endl;
    }
    return 0;
}