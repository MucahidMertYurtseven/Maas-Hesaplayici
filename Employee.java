public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary >= 1000) {
            double vergi =(this.salary/100)*3;
            return vergi;
        } else {
            return 0;
        }
    }

    int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        int year=2021;
        double raise;
        if(year-this.hireYear<10){
            raise= this.salary*(0.05);
            return raise;
        } else if ((year-this.hireYear<20)&&(year-this.hireYear>9)) {
            raise= this.salary*(0.1);
            return raise;
        }else{
            raise= this.salary*(0.15);
            return raise;
        }
    }

    void printWorkerInfo(){
        System.out.printf("Adi : %s \nMaasi : %f\nCalisma Saati : %d\nBaslangic yili : %d\nVergi : %f\nBonus : %d\nMaas Artisi : %f\nVergiler ve Bonuslar ile birlikte toplam maas : %f\nYeni maas : %f", this.name, this.salary, this.workHours, this.hireYear, tax(),bonus(), raiseSalary(), (this.salary+bonus()-tax()),(this.salary+raiseSalary()+bonus()-tax()));
    }
}
