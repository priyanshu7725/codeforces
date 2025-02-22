#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int arr[3], maxVotes = -1, countMax = 0;

        for (int i = 0; i < 3; i++) {
            cin >> arr[i];
            if (arr[i] > maxVotes) {
                maxVotes = arr[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] == maxVotes) {
                countMax++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] == maxVotes) {
                if (countMax > 1) {
                    cout << "1 ";
                } else {
                    cout << "0 ";
                }
            } else {
                cout << (maxVotes + 1 - arr[i]) << " ";
            }
        }
        cout << endl;
    }
    return 0;
}
