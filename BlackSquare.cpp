#include <iostream>
using namespace std;

int main() {
    int a, b, c, d;
    cin>>a>>b>>c>>d;
    string pattern;
    cin>>pattern;
    int sum = 0;

    for ( int i = 0; i < pattern.length(); i++ ) {
        int strip = pattern[i] - '0';
        
        switch(strip) {
            case 1:
                sum += a;
                break;
            case 2:
                sum += b;
                break;
            case 3:
                sum += c;
                break;
            case 4:
                sum += d;
                break;
        }
    }
    cout<<sum;
    return 0;
} 