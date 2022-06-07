import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][3];
        for(int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            arr[i] = new int[] {x,y,z};

            
        }

        System.out.println(Arrays.deepToString(arr));

        in.close();
    }
}
