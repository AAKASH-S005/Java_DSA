Convert a String to Upper Case and Lower Case in java (Strings)

CODE :

import java.util.*;
public class StrLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Profession = sc.nextLine();
        char[] ch1 = Profession.toCharArray();
        char[] ch2 = Profession.toCharArray();
        System.out.print("String to Character Array : ");
        for(int i=0;i<Profession.length();i++){
            System.out.print(ch1[i]+"");
        }
        System.out.println();
        int length = Profession.length();
        System.out.println("Length of the String is : "+length);
        for(int i=0;i<length;i++){
            if(ch1[i]>='a' && ch1[i]<='z'){
                ch1[i] = (char)(((int)ch1[i])-32);
            }
        }
        for(int i=0;i<length;i++){
            if(ch2[i]>='A' && ch2[i]<='Z'){
                ch2[i] = (char)(((int)ch2[i])+32);
            }
        }
        String FinalUpper = new String(ch1);
        System.out.println("Upper Case String is : "+FinalUpper);
        String FinalLower = new String(ch2);
        System.out.println("Lower Case String is : "+FinalLower);
    }
}
