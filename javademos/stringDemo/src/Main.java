import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String message = "   Today weather extremly hot.    ";
        System.out.println(message);

   /*   System.out.println("Number of Element : " + message.length());
        System.out.println("5th element : " + message.charAt(4));
        System.out.println(message.concat("!!!!"));
        System.out.println();
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("o"));
        System.out.println(message.lastIndexOf("o"));*/

        String newmessage = message.replace(' ','-');
        System.out.println(newmessage);
        System.out.println(message.substring(0,5));

        for (String word:message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());

    }
}