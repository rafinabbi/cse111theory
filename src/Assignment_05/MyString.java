package Assignment_05;

public class MyString {
    char[] c;

    public MyString(String s) {
        c = s.toCharArray();
    }

    public int length() {
        return c.length;
    }

    public Character charAt(int a) {
        return c[a];
    }

    public boolean startsWith(MyString a) {
        for (int i = 0; i < a.c.length; i++) {
            if (c[i] == a.c[i]) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean endsWith(MyString a) {
        int x=this.c.length-1;
        for (int i = a.c.length-1; i >0; i--) {
            if (a.c[i] == this.c[x--]) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public String replaceFirst(char a,char b){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]==a){
                c[i]=b;
                break;
            }
        }
        return new String(c);
    }

    public char replaceAll(char a,char b){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]==a){
                c[i]=b;
            }
        }
        return b;
    }
    public char[] toLowerCase() {
        for (int i = 0; i < c.length; i++) {
            if(c[i]>=65&&c[i]<=90){
                c[i]=(char)(c[i]+32);
            }
        }
        return c;
    }
    public char[] toUpperCase(){
        for (int i = 0; i < c.length; i++) {
            if((int)c[i]>=97&&(int)c[i]<=122){
                c[i]=(char)(c[i]-32);
            }
        }
        return c;
    }
    public boolean equals(MyString s){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]!=s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}