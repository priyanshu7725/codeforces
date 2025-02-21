#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int res[n];
        for (int i = 0; i < n; i++) {
            string row;
            cin >> row;
            for (int j = 0; j < 4; j++) {
                if (row[j] == '#') {
                    res[n - i - 1] = j + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            cout << res[i] << " ";
        }
        cout << "\n";
    }
    return 0;
}