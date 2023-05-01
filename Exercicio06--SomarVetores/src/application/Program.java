package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantos valores serão digitados em cada vetor? ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] sumVect = new int[n];


        System.out.printf("Digite os valores do vetor A:%n");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.printf("Digite os valores do vetor B:%n");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.printf("VETOR RESULTANTE:%n");
        for (int i = 0; i < sumVect.length; i++) {
            sumVect[i] = vectA[i] + vectB[i];
            System.out.println(sumVect[i]);
        }


        sc.close();
    }
}
