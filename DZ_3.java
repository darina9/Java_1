public class DZ_3 {
    public static void main(String[] args) {
        int n = 1000;
        boolean val = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    val = false;
                    break;
                }
            }
            if (val == true) {
                System.out.print(i + ", ");
            } 
            else val = true;
        }
    } 

}
