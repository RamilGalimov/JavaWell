package lesson23.reflection;

public class Doctor {
    public String name;
    public int age;
    public String specification;
    public Integer salary;

    public Doctor() {
    }

    public Doctor(String name, int age, String specification, Integer salary) {
        this.name = name;
        this.age = age;
        this.specification = specification;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctor doctor = (Doctor) o;

        if (age != doctor.age) return false;
        if (name != null ? !name.equals(doctor.name) : doctor.name != null) return false;
        if (specification != null ? !specification.equals(doctor.specification) : doctor.specification != null)
            return false;
        return salary != null ? salary.equals(doctor.salary) : doctor.salary == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (specification != null ? specification.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specification='" + specification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
