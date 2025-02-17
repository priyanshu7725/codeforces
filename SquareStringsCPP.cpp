#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;

    while ( t-- ) {
        string str;
        cin>>str;

        string part1 = str.substr(0,str.length()/2);
        string part2 = str.substr(str.length()/2);

        if ( part1 == part2) {
            cout<<"YES"<<endl;
        }
        else {
            cout<<"NO"<<endl;
        }
    } 
    
    return 0;
}