public class Rec01Sol {
    
    /**
     * Return true if s contains a vowel (a, e, i, o u). False otherwise. 
     */
    public static boolean containsVowel(String s) {
        /* could also do:
         *      - series of if-statements\
         *          if (s.contains("a")) return true; 
         *          ...
         *   
         *      - single return statement
         *          return s.contains("a") || s.contains("e") || ...;
         */
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (s.contains(vowel)) return true;
        }
        return false;
    }
    
    /**
     * This method returns the long form of the date. For example, dateToString(28,8,2018)
     * returns "28 August 2000". 
     * Precondition: Assume the arguments of a call form a valid date 
     */
    public static String dateToString(int d, int m, int y) {
        // convert the month int into its corresponding string name
        String monthName = "Invalid Month";
        if (m == 1) monthName = "January";
        else if (m == 2) monthName = "February";
        else if (m == 3) monthName = "March";
        else if (m == 4) monthName = "April";
        else if (m == 5) monthName = "May";
        else if (m == 6) monthName = "June";
        else if (m == 7) monthName = "July";
        else if (m == 8) monthName = "August";
        else if (m == 9) monthName = "September";
        else if (m == 10) monthName = "October";
        else if (m == 11) monthName = "November";
        else if (m == 12) monthName = "December";
        
        // return a string concatenation of the date (don't forget the spaces!)
        return d + " " + monthName + " " + y;
    }
    
    /**
     * This method returns true if s contains at least two ‘e’s and false otherwise. 
     * For example, stringE(“”) is false, stringE(“Hello”) is false, 
     * and stringE(“Helle”) is true
     */
    public static boolean stringE(String s) {
        // get the first index 'e' occurs
        int firstEIndex = s.indexOf('e');
        
        // if no 'e' occurrence -> return false
        if (firstEIndex == -1) return false;
        
        // if the 'e' index is the same searching forwards and backwards, there is only
        // one 'e' -> return false;
        if (firstEIndex == s.lastIndexOf('e')) return false;
        
        // two distinct indices of 'e' -> at least 2 'e' occurrences
        return true;
    }

    public static void main(String[] args) {
        // calls for containsVowel
        System.out.println(containsVowel("Hello World!"));
        System.out.println(containsVowel("n0 v0w3ls"));
        
        // calls for dateToString
        System.out.println(dateToString(28, 8, 2000));
        System.out.println(dateToString(19, 9, 2018));
        
        // calls for stringE
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Helle"));
        System.out.println(stringE("Hllo"));
    
    }

}
