  
import java.util.Scanner;
public class DZ_2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = st.nextInt();
        st.close();
        int f=1;
        for (int i = 1; i <= n; i++) {
        f*=i;}
        
                System.out.println(f);}
        }
            