#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int maxi = 1, curr = 1;

    for (int i = 1; i < n; i++) {
        if (arr[i] >= arr[i - 1]) {
            curr++;
            maxi = max(maxi, curr);
        } else {
            curr = 1;
        }
    }

    cout << maxi << endl;
    return 0;
}
