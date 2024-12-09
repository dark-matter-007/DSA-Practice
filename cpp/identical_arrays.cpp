//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    bool isIdentical(vector<int> &arr1, vector<int> &arr2)
    {
        // directly checking the size
        if (arr1.size() != arr2.size())
            return false;

        // checking the count of each element
        std::unordered_map<int, int> map;

        // creating ref table;
        for (auto elem : arr1)
        {
            map[elem]++;
        }

        for (auto elem : arr2)
        {
            map[elem]--;
            if (map[elem] < 0)
            {
                return false;
            }
        }

        // if all tests passed
        return true;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cout << "Number of cases: " , cin >> t;
    cin.ignore();
    while (t--) {
        string s;
        cout << "arr1: ";
        getline(cin, s);
        stringstream ss(s);
        vector<int> arr1, arr2;
        int num;
        while (ss >> num) {
            arr1.push_back(num);
        }
        cout << "arr2: ";
        getline(cin, s);
        ss.clear();
        ss.str(s);
        while (ss >> num) {
            arr2.push_back(num);
        }
        Solution ob;
        bool ans = ob.isIdentical(arr1, arr2);
        if (ans) {
            cout << "true" << endl;
        } else {
            cout << "false" << endl;
        }
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends