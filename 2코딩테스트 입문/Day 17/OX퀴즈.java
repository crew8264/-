class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        
        for (String st : quiz) {
            String[] tmp = st.split(" ");
            switch(tmp[1]) {
                case "+":
                    if((Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2])) == Integer.parseInt(tmp[4]))
                        answer[idx++] = "O";
                    else
                        answer[idx++] = "X";
                    break;
                case "-":
                    if((Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2])) == Integer.parseInt(tmp[4]))
                        answer[idx++] = "O";
                    else
                        answer[idx++] = "X";
                    break;
            }
            
            System.out.printf("%s %s %s %s %s\n", tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
        }
        return answer;
    }
}