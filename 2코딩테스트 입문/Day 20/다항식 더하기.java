class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int sangsu = 0;
        
        String[] str = polynomial.split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].contains("x")){
                x += str[i].equals("x") 
                    ? 1 
                    : Integer.parseInt(str[i].replace("x", ""));
                
            }else if(!str[i].equals("+")){
                sangsu += Integer.parseInt(str[i]);
            }
        }
        
        if(x == 1 && sangsu == 0){
            answer = "x";
        }else if(x == 1 && sangsu != 0){
            answer = "x + " + sangsu;
        }else if(x != 0 && sangsu == 0){
            answer = x + "x";
        }else if(x != 0 && sangsu != 0){
            answer = x + "x + " + sangsu;
        }else if(x == 0 && sangsu != 0){
            answer = Integer.toString(sangsu);
        }
        
        return answer;
    }
}
