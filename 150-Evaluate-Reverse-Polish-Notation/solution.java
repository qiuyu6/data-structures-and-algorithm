public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<Integer>();
        
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int a = num.pop();
                int b = num.pop();
                num.push(a+b);
            }else if(tokens[i].equals("-")){
                int a = num.pop();
                int b = num.pop();
                num.push(b-a);
            }else if(tokens[i].equals("*")){
                int a = num.pop();
                int b = num.pop();
                num.push(b*a);
            }else if(tokens[i].equals("/")){
                int a = num.pop();
                int b = num.pop();
                num.push(b/a);
            }else{
                int temp = Integer.parseInt(tokens[i]);
                num.push(temp);
            }
        }
        
        return num.pop();
    }
}