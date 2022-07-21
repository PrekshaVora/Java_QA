public class StringMethod {
    public static void main(String[] args){
        String name = "Preksha";
        String val = "Hello";
        String key = "";
        //System.out.println(name);
        int value =name.length();
        System.out.println(value); //length of the string 

        // String lstring =name.toLowerCase();//convert to small letter
        // System.out.println(lstring.toLowerCase());

        // String ustring =name.toUpperCase();//convert to capital letter 
        // System.out.println(ustring);

        // String nonTrimmedString = "      Preksha    ";
        // System.out.println(nonTrimmedString); // print string as it is

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString); // remove the spaces

        // System.out.println(name.substring(2));// print string from the start of index number 
        // System.out.println(name.substring(2, 6)); 

        // System.out.println(name.replace('e','a'));//replace withold and new char 
        // System.out.println(name.replace("ek","at"));

        // System.out.println(name.startsWith("Pr")); //return true or false

        // System.out.println(name.endsWith("ha"));//return true or false

        // System.out.println(name.charAt(3));//print the index value

        // System.out.println(name.equals("preksha"));//checks the string 
        
        System.out.println(name.compareTo(val));//compare the string with current string value 
        System.out.println(key.compareTo(val)); 

        System.out.println(name.concat("Good morning")); //concat at the end

        System.out.println(name.contains("tp")); //checks the string  is present or not 




    }
}
