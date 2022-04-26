/** Khycy Janz Alvarez
 * main
 */
public class main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();


        // set name
        person1.setFirstName("Khycy");
        person1.setLastName("Alvarez");

        person2.setFirstName("Raphael");
        person2.setLastName("Serantes");

        person3.setFirstName("Kristel");
        person3.setLastName("Casalda");

        person4.setFirstName("Jesserie");
        person4.setLastName("Pinuela");

        person5.setFirstName("Dae Hyeon");
        person5.setLastName("Song");

        //display name
        System.out.println(person1.getFirstname() + " " + person1.getLastname());
        System.out.println(person2.getFirstname() + " " + person2.getLastname());
        System.out.println(person3.getFirstname() + " " + person3.getLastname());
        System.out.println(person4.getFirstname() + " " + person4.getLastname());
        System.out.println(person5.getFirstname() + " " + person5.getLastname());

    }
}