package com.tugasuts;

public class Employee {
    private String nama;
    private String belakang;
    private String dept;
    private String hire;
    private int salary;


    public Employee (String nama, String belakang,String dept,String hire, int salary){
       this.nama=nama;
       this.belakang=belakang;
       this.dept=dept;
       this.hire=hire;
       this.salary=salary;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBelakang() {
        return belakang;
    }

    public void setBelakang(String belakang) {
        this.belakang = belakang;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getHire() {
        return hire;
    }

    public void setHire(String hire) {
        this.hire = hire;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int bonus(int bonus){
        return salary*(100+bonus);
    }
    public void  tostr (){
        System.out.println("Nama Lengkap : "+nama +" "+belakang + ", "+"Departemen : "+dept +", "+"Tanggal Masuk: "+hire
                +", "+"Gaji : "+salary  );
    }


}
