/**Implement  builder design pattern by taking Person with the attributes FirstName, LastName, age, address … upto 10 attributes
Is the same result can be achieved by using setters? 
If yes, demonstrate
If no, demonstrate
Is your code mutable?  
If yes, demonstrate 
If no, demonstrate */
public class Main {
    public static void main(String[] args) {

        //name,age,dob,gender are basic and required fields to build a person
        Person person1 = new PersonBuilder("Vamshi",23,"male","11/05/1999").buildMutablePerson();
        System.out.println(person1);

        //can set optional parameters
        Person person2 = new PersonBuilder("Vamshi",23,"male","11/05/1999").setMaritalStatus("single").setWorkingAt("zemoso").buildMutablePerson();
        System.out.println(person2);
        //Yes, the same result can be achieved by using setters
        Person person = new Person();
        person.setName("Vamshi");
        person.setAddress("Hyd");
        person.setGender("Male");

        // mutable
        person2.setAddress("hyderabad");
        System.out.println(person2);
        //immutable
        ImmutablePerson immutablePerson = new PersonBuilder("Vamshi",23,"male","11/05/1999").setAddress("pune").setSalary("3400000").setMaritalStatus("single").buildImmutablePerson();
        //no methods are available to mutate
        System.out.println(immutablePerson);
    }
}
