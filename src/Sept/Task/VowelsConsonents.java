package Sept.Task;

import java.util.Scanner;

public class VowelsConsonents {
    public static void main(String[] args) {
        int vowels = 0;
        int consonents = 0;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        for(int i=0 ; i< name.length();i++)
        {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
                vowels++;
            else
                consonents++;
        }
        System.out.println(vowels);
        System.out.println(consonents);
    }
}
