import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pilih;
        Scanner inputan = new Scanner(System.in);
        System.out.println("Ini adalah program java");
        System.out.println("===========================");
        System.out.println("1. Perulangan FOR");
        System.out.println("2. Perulangan WHILE");
        System.out.println("3. Perulangan DO-WHILE");
        System.out.println("4. Array 1 DIMENSI");
        System.out.println("5. Array Multidimensi");
        System.out.println("Masukkan pilihan anda = "); pilih = inputan.nextInt();
        System.out.println("-----------------------------");
        switch(pilih) {
            case 1: {
                System.out.println("ANDA MEMILIH PERULANGAN FOR");
                for(int i=1; i<=10; i++){
                    System.out.println(i+ " ");
                }
                break;
            }
            case 2: {
                System.out.println("ANDA MEMILIH PERULANGAN WHILE");
                int i=1;
                while(i<=10){
                    System.out.println(i);
                    i++;
                }
                break;
            }
            case 3: {
                System.out.println("ANDA MEMILIH PERULANGAN DO-WHILE");
                int i=15;
                do{
                    System.out.println(i);
                    i++;
                }while(i<=14);
                System.out.println("Nilai terakhir i = " +i);
                break;
            }
            case 4: {
                System.out.println("ANDA MEMILIH ARRAY 1 DIMENSI");
                int [] i= new int[5];
                i[0]=1;
                i[1]=2;
                i[2]=3;
                i[3]=4;
                i[4]=5;
                System.out.println(i[0]+ " "); System.out.println(i[1]+ " "); System.out.println(i[2]+ " "); System.out.println(i[3]+ " "); System.out.println(i[4]+ " ");
                break;
            }
            case 5: {
                System.out.println("ANDA MEMILIH ARRAY MULTIDIMENSI");
                int [][] i={{1,2},{3,4}};
                System.out.println(i[0][0]+ " "); System.out.println(i[0][1]+ " "); System.out.println(i[1][0]+ " "); System.out.println(i[1][1]+ " ");
                break;
            }
        }
    }
}
