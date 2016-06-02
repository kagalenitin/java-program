package com.learn.arrayprograms;

/**
 * Created by nkagale on 5/2/16.
 */
public class FindStringFromWithin {

    public static void main(String arg[]){
//        String str1 = "Hello World";
//        String str2 = "Helo Wrd";
//        StringBuffer res = new StringBuffer(str1);
//        String ls = null;
//        char[] str1ToCharArray = str1.toCharArray();
//        char[] str2ToCharArray = str2.toCharArray();
//
//        for(int i=0; i<str1ToCharArray.length; i++){
//           if(str2.contains(String.valueOf(str1ToCharArray[i]))){
//             ls = str1.replace(String.valueOf(str1ToCharArray[i]), "");
//
//           }
//        }
//        System.out.println("RES Value is: " + ls);

        // create 2 Character objects c1, c2
        Character c1, c2;

        // assign values to c1, c2
        c1 = new Character('a');
        c2 = new Character('A');

        // create an int type
        int res;

        // compare c1 with c2 and assign result to res
        res = c1.compareTo(c2);

        String str1 = "Both values are equal ";
        String str2 = "First character is numerically greater";
        String str3 = "Second character is numerically greater";

        if( res == 0 ){
            System.out.println( str1 );
        }
        else if( res > 0 ){
            System.out.println( str2 );
        }
        else if( res < 0 ){
            System.out.println( str3 );
        }
    }
}
