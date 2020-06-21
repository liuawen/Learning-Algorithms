/// Source : https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/
/// Author : liuyubobobo
/// Time   : 2018-06-07

#include <iostream>
#include <set>

using namespace std;

#define N 100000

class MyHashSet {

private:
    set<int> data[N];

public:
    /** Initialize your data structure here. */
    MyHashSet() {

    }

    void add(int key) {
        data[key % N].insert(key);
    }

    void remove(int key) {
        data[key % N].erase(key);
    }

    /** Returns true if this set did not already contain the specified element */
    bool contains(int key) {
        return data[key % N].find(key) != data[key % N].end();
    }
};


int main() {

    return 0;
}