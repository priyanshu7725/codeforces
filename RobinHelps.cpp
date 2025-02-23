#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;

    while(t--) {
        int n, thresh;
    cin>>n;
    cin>>thresh;
    int coins = 0;
    int count = 0;

    for ( int i = 0; i < n; i++) {
        int a;
        cin>>a;

        if ( a >= thresh) {
            coins+=a;
        }
        else if ( a == 0 && coins > 0) {
            coins--;
            count++;
        }
    }

    cout<<count<<endl;
    }
    return 0;
}