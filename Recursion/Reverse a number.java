// without loop
public class Main { 
    public static int rev(int n, int reversed) { 
        if (n == 0) {
            return reversed;
        }
        return rev(n / 10, reversed * 10 + n % 10);  // Recursive call
    } 
    
    public static void main(String args[]) { 
        int n = 68; 
        System.out.println(rev(n,0));  // Call rev with an initial reversed value of 0   output -->86
    } 
}

// using loop
public class Main { 
    public static int rev(int n) { 
        int reversed = 0;
        while (n > 0) { 
            reversed = reversed * 10 + n % 10;  // Shift and add the last digit
            n = n / 10;  // Remove the last digit from n
        } 
        return reversed; 
    } 
    
    public static void main(String args[]) { 
        int n = 68; 
        System.out.println(rev(n));  // Output the reversed number
    } 
}
