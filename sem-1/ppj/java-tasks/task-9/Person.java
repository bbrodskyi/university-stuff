
public class Person {
    private int birthYear;
    private String name;

    // constructor 1
    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    // constructor 2
    public Person (String name) {
        this.birthYear = 1990;
        this.name = name;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    // methods
    public boolean isFemale() {
        return this.name.toLowerCase().charAt(name.length() - 1) == 'a';
    }

    // static functions
    public static Person getOlder(Person a, Person b) {
        if (a.getBirthYear() < b.getBirthYear()) {
            return a;
        }
        return b;
    }

    public static Person getOldest(Person[] arr) {
        int oldestIdx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].getBirthYear() > arr[i+1].getBirthYear()) {
                oldestIdx = i;
            }
        }
        return arr[oldestIdx];
    }

    public static Person getYoungestFemale(Person[] arr) {
        int youngestIdx = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i].isFemale()) {
                if(arr[i+1].getBirthYear() > arr[i].getBirthYear()) {
                    youngestIdx = i+1;
                }
            } else continue;
        }

        return arr[youngestIdx];
    }

    @Override
    public String toString() {
        return name + "," + birthYear;
    }

}

