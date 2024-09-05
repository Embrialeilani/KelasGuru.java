//Driver Class
public class ManagingPeople {
    public static void main(String[] args) {
        //name, salary
        Employee e1 = new Employee ("Jane", 3500000.00);
        Employee e2 = new Employee ("Brandon", 2000000.00);
        Employee e3 = new Employee ("Anna",2500000.00);

        // Bandingkan gaji dan cetak karyawan dengan gaji tertinggi
        if (e1.getSalary() > e2.getSalary() && e1.getSalary() > e3.getSalary()) {
            System.out.println("Jane memiliki gaji tertinggi..");
        } else if (e2.getSalary() > e1.getSalary() && e2.getSalary() > e3.getSalary()) {
            System.out.println("Brandon memiliki gaji tertinggi..");
        } else {
            System.out.println("Anna memiliki gajintertinggi.");
        }
        
        e1.print();
        e2.print();
        e3.print();

    }

    

}
