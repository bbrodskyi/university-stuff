
public class Main {
    public static void main(String[] args) {

        divide("Testing Constructors");
        // testing constructors
        Person a = new Person(1978, "Jack");
        Person b = new Person(1998, "Anna");
        Person c = new Person("Max");
        Person d = new Person("Luke");
        printPerson(a);
        printPerson(b);
        printPerson(c);
        printPerson(d);

        divide("Testing Getters");
        // testing getters
        System.out.println(a.getBirthYear());
        System.out.println(a.getName());

        divide("Testing Methods");
        // testing methods
        System.out.println(a.isFemale());
        System.out.println(b.isFemale());

        divide("Testing Static Functions");
        // testing static functions
        System.out.println(Person.getOlder(a, b)); 

        Person[] persons = { 
            new Person(1989, "Ken"), 
            new Person(1990, "Charlie"), 
            new Person(1991, "Mike") 
        };
        System.out.println(Person.getOldest(persons));

        Person[] persons2 = { 
            new Person(1978, "Jack"),
            new Person(2003, "Kella"),
            new Person(2004, "Marta"),
            new Person(2005, "Anastasia"),
        };
        Person[] persons3 = { 
            new Person(2002, "Karla"),
            new Person(2003, "Kella"),
            new Person(2004, "Anastasia"),
        };
        System.out.println(Person.getYoungestFemale(persons2)); 
        System.out.println(Person.getYoungestFemale(persons3));
    }

    public static void printPerson(Person person) {
        System.out.println(person.toString());
    }

    public static void divide(String message) {
        String divider = "------------------------";
        System.out.println(divider + message + divider);
    }

}

