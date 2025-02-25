#include <bits/stdc++.h> 
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        
        bool isPlus = true;
        int sum = 0;

        for ( int i = 0; i < n; i++) {
            int a;
            cin>>a;

            if (isPlus) {
                sum+=a;
            }
            else {
                sum-=a;
            }

            isPlus = !isPlus;
        }

        cout<<sum<<endl;
    }
    return 0;
}