package pbo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

enum choice {
    persegi,
    persegi_panjang,
    segitiga,
    jajargenjang,
    lingkaran
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih luas dari bangun datar: ");
        System.out.println("-Persegi");
        System.out.println("-Persegi_panjang");
        System.out.println("-Segitiga");
        System.out.println("-Jajargenjang");
        System.out.println("-Lingkaran");

        try {
            String s = sc.nextLine();
            choice n = choice.valueOf(s);
            String answer = "";
            switch (n) {
                case persegi:
                    Double sisi;
                    System.out.println("Masukkan panjang sisi");
                    sisi = sc.nextDouble();
                    persegi rectangle = new persegi(sisi);
                    answer = "Luas persegi adalah " + rectangle.getArea();
                    System.out.println(answer);
                    break;
                case persegi_panjang:
                    Double panjang, lebar;
                    System.out.println("Masukkan panjang dan lebar dari persegi panjang: ");
                    panjang = sc.nextDouble();
                    lebar = sc.nextDouble();
                    persegi_panjang rectangular = new persegi_panjang(panjang, lebar);
                    answer = "Luas persegi panjang adalah " + rectangular.getArea();
                    System.out.println(answer);
                    break;
                case segitiga:
                    Double alas, tinggi;
                    System.out.println("Masukkan panjang alas dan tinggi dari segitiga: ");
                    alas = sc.nextDouble();
                    tinggi = sc.nextDouble();
                    segitiga triangle = new segitiga(alas, tinggi);
                    answer = "Luas segitiga adalah " + triangle.getArea();
                    System.out.println(answer);
                    break;
                case jajargenjang:
                    Double a, t;
                    System.out.println("Masukkan panjang alas dan tinggi dari jajargenjang: ");
                    a = sc.nextDouble();
                    t = sc.nextDouble();
                    jajargenjang parallelogram = new jajargenjang(a, t);
                    answer = "Luas jajargenjang adalah " + parallelogram.getArea();
                    System.out.println(answer);
                    break;
                case lingkaran:
                    // lingkaran(sc);
                    Double radius;
                    System.out.println("Masukkan radius dari lingkaran: ");
                    radius = sc.nextDouble();
                    lingkaran circle = new lingkaran(radius);
                    answer = "Luas lingkaran adalah " + circle.getArea();
                    System.out.println(answer);
                    break;
                default:
                    sc.close();
                    throw new IllegalAccessException();
            }

            File myObj = new File("bangunku.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter fileWritter = new FileWriter("bangunku.txt");
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(answer);
                bufferWritter.close();
                fileWritter.close();
                System.out.println("Successfully wrote to the file.");
            } else {
                FileWriter fileWritter = new FileWriter("bangunku.txt", true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write('\n' + answer);
                bufferWritter.close();
                fileWritter.close();
                System.out.println("Successfully wrote to the file.");
            }

        } catch (Exception e) {
            System.out.println("Pilihan tidak valid");
        }

        sc.close();
    }
}
