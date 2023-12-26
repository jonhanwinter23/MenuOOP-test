package Login;

public class Employee {
    private String name;
    private String password;
    private float salary;
    private static float baseSalary;

    public Employee(String name, String password, float salary) {
        this.name = name;
        this.password = password;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public float getSalary() {
        return salary;
    }

    public static float getBaseSalary() {
        return baseSalary;
    }

    public static void setBaseSalary(float baseSalary) {
        Employee.baseSalary = baseSalary;
    }

    public void updateSalary() {
        salary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", password=" + password + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return name.equals(other.name) && password.equals(other.password);
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
