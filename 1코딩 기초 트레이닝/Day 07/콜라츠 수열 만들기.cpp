#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n) {
    vector<int> answer;
    
    int x = n, idx = 0;
    while(true) {
        //배열에 추가
        answer.push_back(x);
        //루프탈출 조건
        if(x == 1) { break; }
        if(x % 2 == 0) { x /= 2; }
        else { x = (3 * x) + 1; }
    }
    return answer;
}