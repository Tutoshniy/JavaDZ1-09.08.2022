import java.util.Scanner;
public class DZ1 {
    static int triang (int a) {
        if (a == 1)
            return 1;
        else
            return a + triang(a-1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите треугольное число:");
        int chislo = iScanner.nextInt();
        int answer = triang(chislo);
        System.out.printf("Число равно %d", answer);
        iScanner.close();
    }
    
}