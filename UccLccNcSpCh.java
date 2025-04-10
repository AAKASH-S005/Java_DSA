Code to print the Number of Uppercase characters, Lowercase characters, Numerical characters and Special characters in a given String

CODE :

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char ch[] = str.toCharArray();
        int UCC = 0,LCC = 0,Numbers = 0,SpCh = 0;
        for(int i=0;i<len;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                UCC++;
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                LCC++;
            }
            else if(ch[i]>='0' && ch[i]<='9'){
                Numbers++;
            }
            else{
                SpCh++;
            }
        }
        System.out.println("No.of Upper Case characters : "+UCC);
        System.out.println("No.of Lower Case characters : "+LCC);
        System.out.println("No.of Numerical characters : "+Numbers);
        System.out.println("No.of Special Characters : "+SpCh); 
    }
}
