#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    
    while ( t--) {
        int a;
        cin>>a;
        int count = 0;

        while ( a > 1) {
            if ( a%6 == 0) {
                a = a/6;
            }
            else {
                a = a*2;
            }
            count++;
        }

        if ( a== 1) {
            cout<<count<<endl;
        }
        else {
            cout<<-1<<endl;
        }
    }
    return 0;
}