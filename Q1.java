import java.util.*;

class Main {
    private static int middle(int[] triple) {
        int maxidx = 0;
        int minidx = 0;
        for(int i = 0;i<3;i++) {
            if(triple[i] > triple[maxidx])
                maxidx = i;
            if(triple[i] < triple[minidx])
                minidx = i;
        }
        return triple[3-(maxidx+minidx)];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][3];
        for(int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            arr[i] = new int[] { x, y, z };
            
        }

        for(int[] triple : arr) {
            System.out.println(middle(triple));
        }

        in.close();
    }
}
