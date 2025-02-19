#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;

    while(t-- > 0) {
        int n;
        cin>>n;
        int min = 10;
        int arr[n];
        long product = 1;

        for ( int i = 0; i < n; i++) {
            cin>>arr[i];

            if ( min >= arr[i]) {
                min = arr[i];
            }
        }
        bool used = false;
        for ( int i = 0; i < n; i++) {
            if ( arr[i] != min) {
                product *= arr[i];
            }
            else {
                if ( !used) {
                    product *= (min+1);
                    used = true;
                }
                else {
                    product *= arr[i];
                }
            }
        }

        

        cout<<product<<endl;
    }
         
    return 0;
}