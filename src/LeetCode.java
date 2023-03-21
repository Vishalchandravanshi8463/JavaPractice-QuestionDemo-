/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
public class LeetCode {
    public static void main(String[] args) {
         String sentence= "Leetcode is cool";
        boolean Boo= isCircularSentence(sentence);
        System.out.println(Boo);
//         System.out.println(sentence.length());
//        String word[];
//        
//        word = sentence.split(" ");
//        System.out.println(word.length);
//        System.out.println(word[1].length());
    }
    public static boolean isCircularSentence(String sentence) {
        
        String word[];
        //"leetcode exercises sound delightful"
        word = sentence.split(" ");
        int v=word.length;
        if(v==1)
        {
            char p=word[0].charAt(0);
            int pp=word[0].length();
                char ppp=word[0].charAt(pp-1);
            if(p==ppp)return true ;
            else return false;
        }
        else
        {
            for(int i=0;i<v-1;i++)
            {
                int vvv=word[i].length();
                char cc=word[i].charAt(vvv-1);
                char ccc=word[i+1].charAt(0);
                if(cc!=ccc)
                {
                    return false;
                }
            }
            int  ww=word[v-1].length();
            char www=word[v-1].charAt(ww-1);
            char wwww=word[0].charAt(0);
            if(www!=wwww)return false;
        }
        return true;
        
        }
    
    
    
}
