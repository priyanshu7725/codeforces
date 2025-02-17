#include <iostream>
using namespace std;

int level(int a) {
    int sum = 0;

        for ( int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
}
int main() {
    int x;
        cin>>x;
        int sum = 0;
        int endBl = 1;
        int count = 0;
        while ( x > sum) {
            

            sum += level(endBl);

            if ( sum > x) {
                break;
            }
            else if ( sum == x ) {
                count++;
                break;
            }
            else {
                count++;
                endBl++;
            }
        }

        
    cout<<count;
    return 0;
}