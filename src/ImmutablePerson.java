public class ImmutablePerson {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String dob;
    private String placeOfBirth;
    private String workingAt;
    private String maritalStatus;
    private String salary;

    public ImmutablePerson(String name, int age, String address, String gender, String dob, String placeOfBirth, String workingAt, String maritalStatus, String salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.placeOfBirth = placeOfBirth;
        this.workingAt = workingAt;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", workingAt='" + workingAt + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
