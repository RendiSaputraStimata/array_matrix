import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner masukan = new Scanner(System.in);        
        
        int matrix1[] [] = new int[4][4];
        
        int matrix2[] [] = new int[4][4];
        
        System.out.println("Matrix 1");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.println("Masukkan isi Baris ke  [" + a +"][" +b +"] : ");
                matrix1[a][b] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.println("Masukkan isi Kolom ke [" + a +"][" +b +"] : ");
                matrix2[a][b] = masukan.nextInt();
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Matrix 1 ");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.print(matrix1[a][b] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.print(matrix2[a][b] + " ");
            }
            System.out.println("");
        }
      
        
        System.out.println("");
        System.out.println("Pengurangan");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++){
                int hasil = matrix1[a][b] - matrix2[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
    }
}
