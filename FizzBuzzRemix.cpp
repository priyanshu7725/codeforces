#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        cout << 3 * (n / 15) + min(3, n % 15 + 1) << endl;
    }

    return 0;
}
