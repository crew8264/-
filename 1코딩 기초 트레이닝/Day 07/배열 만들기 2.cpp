#include <string>
#include <vector>

using namespace std;

vector<int> solution(int l, int r) {
    vector<int> answer;
    string tmp;
    for(int i = l; i <= r; i++) {
        tmp = to_string(i);
        bool brk = true;
        for(char c : tmp) {
            if((c != '5')&(c != '0'))
                brk = false;
        }
        if(brk) { answer.push_back(i); }
    }
    if(answer.empty()) { answer.push_back(-1); }
    return answer;
}