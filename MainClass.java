public class MainClass {
    public static void main(String [] args){
        Employee employee1= new Employee("Tom", 21, "Civil", "Student");
        Employee employee2= new Employee ("Sam", 22, "Civil", "Professsor");
        Employee employee3 = new Employee("Waxman", 23);
        employee3.setDepartment("Computer Science");
        employee3.setPosition("BULLSHIT");
        System.out.println(employee3.getName());
    }

}
