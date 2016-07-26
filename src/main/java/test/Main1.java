package test;

public class Main1 {
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
	
	public static boolean isValid(String s) {
        char[] stack = new char[s.length()/2+2];
        int top = -1;
        int i=0;
        stack[++top] = s.charAt(i++);
        while(i<s.length() && top >=-1){
            switch(s.charAt(i)){
                case ')':
                    if(stack[top] != '(')
                        return false;
                    break;
                case ']':
                    if(stack[top] != '[')
                        return false;
                    break;
                case '}':
                    if(stack[top] != '{')
                        return false;
                    break;
                default:
                    stack[++top] = s.charAt(i++);
                    continue;
            }
            top--;
            i++;
           
        }
        return top == -1 && i==s.length();
        
    }
}
