package Core_Java_01;

public class Strings {

    /*
     * Java mein split() ek String method hai jo kisi string ko parts (substrings)
     * mein divide karta hai, based on a delimiter (separator).
     * 
     * String[] result = originalString.split("delimiter");
     * 
     * Ye method return karta hai: String[] array
     * Har element is array ka ek substring hota hai jo delimiter ke basis par kata
     * gaya hai.
     * 
     * 🔹 Delimiter kya hota hai?
     * Delimiter ka matlab hai: Kis character ya pattern par string ko kaatna hai.
      
     * Delimiter Use
     * " " Space ke basis pe split karna
     * "," Comma ke basis pe
     * "-" Hyphen ke basis pe
     * "." Dot ke basis pe (escape needed!)
     * "" Har character ko alag karna
     * 
     * 🔹 Special Characters (regex) — dhyan se!
     * Some characters like ., |, *, ?, + etc. are regex symbols, toh unhe split
     * mein use karne ke liye escape karna padta hai.
     * 
     * Example:
     * String s = "a.b.c";
     * String[] parts = s.split("\\."); // dot ko escape karna zaroori hai
     * 
     */
void Split_function() {

    // Example 1: Space ke basis par
    String line = "Java is fun";
    String[] words = line.split(" ");
    System.out.println("Splitting by space:");
    for (String w : words) {
        System.out.println(w);
    }
    // Output: Java  is  fun

    System.out.println();

    // Example 2: Comma ke basis par
    String csv = "apple,banana,grapes";
    String[] fruits = csv.split(",");
    System.out.println("Splitting by comma:");
    for (String w : fruits) {
        System.out.println(w);
    }
    // Output: apple  banana  grapes

    System.out.println();

    // Example 3: Har character alag
    String word = "hello";
    String[] chars = word.split(""); // "" means every character
    System.out.println("Splitting by character:");
    for (String w : chars) {
        System.out.println(w);
    }
    // Output: h  e  l  l  o

    System.out.println();

    // ✅ Example 4: Dot (.) ke basis pe
    String str = "www.google.com";
    String[] parts = str.split("\\."); // Escape dot
    System.out.println("Splitting by dot:");
    for (String w : parts) {
        System.out.println(w);
    }
    // Output: www  google  com
}

    void String_methods()
    {
         String str = "Hello World";

        System.out.println("Contains : "+str.contains("ld"));
        // Printing the length of string using length() method in Java
        int l = str.length();
        System.out.println("Length of \"" + str + "\" is " + l);
        /*
         * Output: Length of "Hello World" is 11 because Space is also included in
         * strings.
         */
        System.out.println("The Lower Case of \"" + str + "\" is " + str.toLowerCase());
        // Output: hello world

        String up = str.toUpperCase();
        System.out.println(up);
        // Output: HELLO WORLD

        String trimming = "\tChirag Chaturvedi     "; // "\t" - Tab-space
        System.out.println("The trimmed string of" + trimming + "is:" + trimming.trim()); // "\t" is tab-space.
        /*
         * Output:Chirag Chaturvedi
         * In .trim() it removes all beginning and ending spaces from given strings but
         * doesn't remove between spaces
         */
        String a = new String("Chaturvedi");
        System.out.println(a.substring(4));
        // Output : urvedi (Starting from index position '2')

        System.out.println(a.substring(5, 10));
        // Output : rvedi (From Index Position'4'to End)

        System.out.println(str + " replaces with " + str.replace('l', 'p'));
        // Output : Heppo Worpd ,Hello world
        System.out.println(str.replace("ello", "appy"));

        /*
         * Output: Happy World
         * In Hello world "ello" replaces with "appy"
         */

        System.out.println(str.startsWith("Hell"));
        // True as it starts with letter "Hell", False otherwise

        System.out.println(str.endsWith("ld"));
        // True as it ends with word "rld".False Otherwise

        System.out.println(str.charAt(1));
        /*
         * Output : e
         * In this case the output it will returns 'e' because it is placed at index 1
         */

        System.out.println(str.indexOf("ll"));
        // Returns -1 if not found else returns its index value here index value is 2
        // indexOf ----> Left to right search karta or jo pehla index pe string ya char
        // milta hai use return karta hai

        System.out.println(str.indexOf("l", 8));
        // Returns -1 if not found else returns its index value here index value is 9
        // where we find our first l from index no. 8

        System.out.println(str.indexOf("llo", 1));

        String str1 = "Fullfill";
        System.out.println(str1.lastIndexOf("ll"));
        // Output: 9 because searching for R to L first l find at index 9
        // lastIndexOf <---- Right to Left search karta or jo pehla index pe string ya
        // char milta hai use return karta hai
        System.out.println(str1.lastIndexOf('f', 7));
        // Output: 5

        System.out.println(str1.equals("Fullfill"));
        // Output: True

        System.out.println(str1.equals("Chirag"));
        // Output: false

        System.out.println(str1.equalsIgnoreCase(str1));
        // Output :true

        /*
         * The Java String class intern() method returns the interned string. It returns
         * the canonical (similar) representation of string.
         * It can be used to return string from memory if it is created by a new
         * keyword.
         * It creates an exact copy of the heap string object in the String Constant
         * Pool.
         */
        System.out.println(str1.intern());

        // String Concatention ---> In Java, String concatenation forms a new String
        // that is the combination of multiple strings.
        // There are two ways to concatenate strings in Java:

        // 1) By + (String concatenation) operator.
        String x = "Captain" + "America";
        System.out.println("After String Concanation using + operator : " + x);
        /*
         * 2) By concat() method:
         * // The String concat() method concatenates the specified string to the end of
         * current string.
         * Syntax: public String concat(String another);
         */
        String c = "Naruto";
        String d = "Uzumaki";

        System.out.println("By using concat() method: " + c.concat(d));
    }

    public static void main(String[] args) 
    {
        Strings obj = new Strings();
        System.out.println("String All Methods : ");
        obj.String_methods();

        System.out.println("Split Function : ");
        obj.Split_function();
    }
}
