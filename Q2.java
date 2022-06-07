import java.util.*;

class Q2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        String[] arr = new String[T];
        for(int i = 0; i < T; i++) {
            arr[i] = in.nextLine();
        }

        for(String s : arr) {
            char[] chars = s.toCharArray();
            int sum = 0;
            for(int i = 0; i <s.length();i++) {
                if(Character.isDigit(chars[i]))
                    sum += Integer.parseInt(String.valueOf(chars[i]));
            }
            System.out.println(sum);
        }

        in.close();
    }
}