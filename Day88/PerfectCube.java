public class PerfectCube {

    static void getPerfectCube(int n) {
        int res;
        for (int i = 1; i <= n; i++) {
            res = i * i * i;
            if (res > n) {
                break;
            }
            System.out.println(res);
        }

    }

    public static void main(String[] args) {
        int n = 100;
        getPerfectCube(n);

    }

}