#include <bits/stdc++.h> 
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        
        int first;
        cin>>first;

        bool isPerfect = true;

        for ( int i = 1; i < n; i++) {
            int note;
            cin>>note;
            
            if ( isPerfect && abs(note - first) != 5 && abs(note - first) != 7) {
                isPerfect = false;
            }

            first = note;
        }

        if ( isPerfect) {
            cout<<"YES"<<endl;
        }
        else {
            cout<<"NO"<<endl;
        }
    }
    return 0;
}