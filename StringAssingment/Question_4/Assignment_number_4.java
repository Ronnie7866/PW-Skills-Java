package StringAssingment.Question_4;

import java.util.Scanner;

public class Assignment_number_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(input);




        String a = "Physics";
        String b = "Wallah";
        String c = a+b;
        System.out.println(c);



//        The length of a string in Java can be found using the length()
//        method:
        String str = "example";
        int length = str.length();
        System.out.println(length);




//      Two strings in Java can be compared using the equals() method:
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1.equals(str2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }





        String k = "refrigerator";
        System.out.println(a.length());



        String demo = "Umbrella";
        boolean per = false;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i) == 'e'){
                per=true;
                break;
            }
        }
            System.out.println(per);





        String x;
        int j=0;
        System.out.println("Enter a string");
        Scanner so=new Scanner(System.in);
        x= so.nextLine();
        char ch[]=new char[20];
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='a'||x.charAt(i)=='A'||x.charAt(i)=='e'||
                    x.charAt(i)=='E'||x.charAt(i)=='i'||x.charAt(i)=='I'||x.charAt(i)=='o'||
                    x.charAt(i)=='O'||x.charAt(i)=='U'|| x.charAt(i)=='u')
            {
                ch[j++]=x.charAt(i);
            }
            else
            {
                continue;
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        
        
        
        
        }
    }
