import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result= 0;
        System.out.println("- Menu Caffe Coffe -");
        System.out.println("1. Espresso Rp. 33000");
        System.out.println("2. Marocchino Rp. 30000");
        System.out.println("3. Americano Rp. 30000");
        System.out.println("4. Antoccino Rp. 35000");
        System.out.println("__________________________");
        
        //input data
        System.out.println("Masukkan Angka Pertama :");
        numbers1 = input.nextInt();
        System.out.println("Masukkan Angka Kedua :");
        numbers2 = input.nextInt();
        
        //Pilihan Operasi
        System.out.println("Masukkan Operasi :");
        choice = input.nextInt();
        
        switch(choice)
        {
            case 1 -> result = numbers1 + numbers2;
            case 2 -> result = numbers1 - numbers2;
            case 3 -> result = numbers1 * numbers2;
            case 4 -> result = numbers1 / numbers2;
            case 5 -> result = numbers1 % numbers2;
            default -> System.out.println("Salah memasukan pilihan. Harap baca pilihan di menu");
        }
        System.out.println("Hasil :" +result);
    }
}