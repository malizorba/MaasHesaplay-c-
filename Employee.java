public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYears;

    Employee(String name,double salary,double workHours,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYears=hireYears;
    }
    double tax(){
        double taxs;
        if (this.salary>1000){
           taxs=this.salary*0.03;
            return taxs;
        }else{
           return taxs=0;
        }
    }
    double bonus(){
        double bonuss;
        double extrahours;
        if (this.workHours>40){
            extrahours= (this.workHours-40);
            bonuss=extrahours*30;
            return bonuss;
        }else {
           return bonuss=0;
        }
    } double raiseSalary(){
        double raisee;
        if (this.hireYears>2011){
            raisee=this.salary*0.05;
            return raisee;
        }else if (this.hireYears>2001 && this.hireYears<2011){
            raisee=this.salary*0.10;
        }else{
           raisee=this.salary*0.15;
           return raisee;
        }
        return raisee;
    } void addprint(){
        System.out.println("Adı :"+this.name);
        System.out.println("Maaşı :"+this.salary);
        System.out.println("Çalışma Saati :"+this.workHours);
        System.out.println("Başlangıç yılı :"+this.hireYears);
        System.out.println("vergi :"+tax());
        System.out.println("Bonus :"+bonus());
        System.out.println("Bonus :"+bonus());
        System.out.println("Maaş Artışı :"+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş :"+(this.salary-tax()+bonus()));
        System.out.println(" Toplam Maaş :"+(this.salary-tax()+bonus()+raiseSalary()));


    }

}
