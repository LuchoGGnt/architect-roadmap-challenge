package semana1.entities.user;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private final String dni;
    private String address;
    private double salary;

    public User(
            String firstName,
            String lastName,
            int age,
            String dni,
            String address,
            double salary
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.address = address;
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
