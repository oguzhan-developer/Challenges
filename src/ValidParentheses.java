public class ValidParentheses {

    public static boolean validParentheses(String parens)
    {
        char[] chars = parens.toCharArray();
        int l=0,f=0;
        for(char c : chars){
            if(c == '(')l++;
            if(c == ')')f++;
        }
        if(l==f)return true;
        else return false;

    }
    static void print(Boolean condition){System.out.println(condition);}

    public static void main(String[] args) {
        print(validParentheses( "())" ));
        print(validParentheses( "32423(sgsdg)" ));
        print(validParentheses( "(dsgdsg))2432" ));
        print(validParentheses( "adasdasfa" ));
    }
}