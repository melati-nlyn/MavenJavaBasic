package org.example;
import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Selamat datang");
        System.out.println("Pilih bentuk yang mau digambar");
        System.out.println("1. Segitiga siku-siku");
        System.out.println("2. Segitiga sama kaki");
        System.out.println("3. Persegi panjang");
        System.out.println("4. Persegi");
        System.out.println("5. exit");
    }

    public void drawShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Masukan panjang segitiga siku-siku: ");
                int height = scanner.nextInt();
                drawTriangleSS(height);
                break;
            case 2:
                System.out.println("Masukan panjang segitiga sama kaki: ");
                int height2 = scanner.nextInt();
                drawTriangleSK(height2);
                break;
            case 3:
                System.out.println("Masukan lebar dan tinggi persegi panjang: ");
                int width = scanner.nextInt();
                int height3 = scanner.nextInt();
                drawRectangle(width, height3);
                break;
            case 4:
                System.out.println("Masukan ukuran persegi: ");
                int width1 = scanner.nextInt();
                drawSquare(width1);
                break;
            case 5:
                System.exit (0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    // untuk membuat segitiga sama sisi
    public void drawTriangleSS(int height) {
        //nested loop
        for (int i = 1; i <= height; i++) {
            //inner loop (untuk column)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    // untuk buat segitiga sama kaki
    public void drawTriangleSK(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // untuk buat persegi panjang
    public void drawRectangle (int width, int height){
        for (int i = 1; i <= height; i++) {
            // Loop untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= width; j++) {
                    System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }

    // untuk buat persegi
    public void drawSquare(int width1){
        for (int i = 0; i < width1; i++){
            for(int j = 0; j < width1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void run() {
        //loop
        while (true) {
            displayMenu();
            System.out.println("Masuk pilihan anda: ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}

