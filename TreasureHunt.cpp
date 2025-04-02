#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int x,y,a;
        int depth = 0;
        bool lilB = true;
        cin>>x>>y>>a;

        while (depth < a+0.5) {
            if (lilB) {
                depth+=x;
            }
            else {
                depth += y;
            }
            if ( depth >= a+0.5 ) {
                break;
            }
            else {
                lilB = !lilB;
            }
        }

        if ( lilB) {
            cout<<"NO"<<endl;
        }
        else {
            cout<<"YES"<<endl;
        }
    } 

    return 0;
}