
public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Mamut Binpinar", 1200, 45, 2000);
        worker1.printWorkerInfo();
        worker1.setName("Mahmut BİNPINAR");
        worker1.setSalary(5000);
        worker1.setWorkHours(50);
        worker1.setHireYear(1988);
        worker1.printWorkerInfo();
    }
}