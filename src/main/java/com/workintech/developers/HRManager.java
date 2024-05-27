package com.workintech.developers;

public class HRManager extends Employee{
    private String[] juniorDevelopers = new String[10]; // Örnek boyut
    private String[] midDevelopers = new String[10]; // Örnek boyut
    private String[] seniorDevelopers = new String[10]; // Örnek boyut

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, int salary, String[] juniorDevelopers, String[] midDevelopers, String[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void work() {
        System.out.println("HRManager is managing human resources.");
        setSalary(getSalary()+3000);
    }
public void addEmployee(int index,JuniorDeveloper developer){
    if (index >= 0 && index < juniorDevelopers.length) {
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer.getName();
            System.out.println(developer.getName() + " juniorDevelopers dizisine eklendi.");
        } else {
            System.out.println("Hata: İlgili index dolu!");
        }
    } else {
        System.out.println("Hata: Geçersiz index!");
    }

}
    public void addEmployee(int index,MidDeveloper developer){
        if (index >= 0 && index < midDevelopers.length) {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer.getName();
                System.out.println(developer.getName() + " midDevelopers dizisine eklendi.");
            } else {
                System.out.println("Hata: İlgili index dolu!");
            }
        } else {
            System.out.println("Hata: Geçersiz index!");
        }

    }
    public void addEmployee(int index,SeniorDeveloper developer){
        if (index >= 0 && index < seniorDevelopers.length) {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer.getName();
                System.out.println(developer.getName() + " seniorDevelopers dizisine eklendi.");
            } else {
                System.out.println("Hata: İlgili index dolu!");
            }
        } else {
            System.out.println("Hata: Geçersiz index!");
        }

    }


}
