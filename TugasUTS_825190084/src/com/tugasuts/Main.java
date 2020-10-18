package com.tugasuts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee A =new Employee("Gilbert","Sanko","Prog","15 DECEMBER 2020",2000000);
        Employee B =new Employee("IVAN","VARIAN","IT","5 MARET 2018",1500000);
        Employee C =new Employee("RIO","MULIANTO","SI","27 APRIL 2018",1550000);
        Employee D =new Employee("VINCENT","MARCELINO","Prog","30 NOVEMBER 2017",2500000);
        Employee E =new Employee("KAREL","PRASETYA","MARKETING","27 JULI 2018",2450000);
        Employee F =new Employee("JOHAN","TJUNG","ACCOUNTING","1 JANUARI 2020 ",2600000);
        Employee G =new Employee("SAMUEL","KURNIAWAN","SI","12 Agustus 2020",2500000);
        Employee H =new Employee("SASKIA","FEBE","MARKETING","17 AGUSTUS 2018",2450000);
        Employee I =new Employee("SHALSA","DESI","ACCOUNTING","25 FEBRUARI 2020 ",2600000);

        String nm;
       int bns;
        Scanner s=new Scanner(System.in);
        System.out.println("!----|-------------!");
        System.out.println("!No  | Nama        !");
        System.out.println("!----|-------------!");
        System.out.println("!1.  | Gilbert     !");
        System.out.println("!2.  | Ivan        !");
        System.out.println("!3.  | Rion        !");
        System.out.println("!4.  | Vincent     !");
        System.out.println("!5.  | Karel       !");
        System.out.println("!6.  | Johan       !");
        System.out.println("!7.  | Samuel      !");
        System.out.println("!8.  | Saskia      !");
        System.out.println("!9.  | Salsa       !");
        System.out.println("!----|-------------!");

        System.out.println("Masukan Nama :");
        nm= s.next();


        switch (nm) {
            case "gilbert" -> {
                A.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();

                System.out.println("Total Gaji " + A.getNama() +" "+A.getBelakang() +" : "+ A.bonus(bns));
            }
            case "ivan" -> {
                B.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + B.getNama()+" "+B.getBelakang() +" : " + B.bonus(bns));
            }
            case "rio" -> {
                C.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + C.getNama()+" "+C.getBelakang() +" : " + C.bonus(bns));
            }
            case "vincent" -> {
                D.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + D.getNama() +" "+D.getBelakang() +" : "+ D.bonus(bns));
            }
            case "karel" -> {
                A.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + E.getNama() +" "+E.getBelakang() +" : "+ E.bonus(bns));
            }
            case "johan" -> {
                B.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + F.getNama() +" "+F.getBelakang() +" : " + F.bonus(bns));
            }
            case "samuel" -> {
                G.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + G.getNama() +" "+G.getBelakang() +" : " + G.bonus(bns));
            }
            case "saskia" -> {
                H.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + H.getNama() +" "+H.getBelakang() +" : " + H.bonus(bns));
            }
            case "shalsa" -> {
                I.tostr();
                System.out.println("Masukan Bonus (1-100) :");
                bns=s.nextInt();
                System.out.println("Total Gaji : " + I.getNama() +" "+I.getBelakang() +" : " + I.bonus(bns));
            }
            default -> System.out.println("Karyawan Tidak Ada");
        }



    }
}
