public class Q5 {
 
    static boolean PalindromeCheck(String str)
    {
        int a = 0, b = str.length() - 1;
 
        while (a < b) {
            
            if (str.charAt(a) != str.charAt(b))
                return false;
            a++;
            b--;
        }

        return true;
    }
 
    public static void main(String[] args)
    {
        String[] str = {"level","madam","reviver", "civic", "civil", "emulator"};
        
        System.out.println("PALINDROME CHECK");
        
        for (int i = 0; i < str.length; i++){
            
             if (PalindromeCheck(str[i]))
                  System.out.println("Kata " + str[i] + " Adalah Kata Palindrome");
             else
                  System.out.println("Kata " + str[i] + " Bukan Kata Palindrome");
                  
        }
    }
}