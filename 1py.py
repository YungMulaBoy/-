#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> table;
    table["Alice"] = 10;
    int v = table["Alice"];
    table.erase("Alice");
    return 0;
}