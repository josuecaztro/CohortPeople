package zipcode.rocks;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }

    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }

    // this goes in class Main.java
        // copy from here...
        private List handWrittenLoadOfData() {
            ArrayList<Person> students = new ArrayList<>();

            Person newPerson2 = new Person("Teddy","Archibald");
            newPerson2.setFavBeverage("Half and Half");
            newPerson2.setFavColor("Red");
            newPerson2.setBirthMonth("March");
            newPerson2.setHasPets(false);
            students.add(newPerson2);

            Person newPerson3 = new Person("Peter","Van Beever");
            newPerson3.setFavBeverage("Latte");
            newPerson3.setFavColor("Purple");
            newPerson3.setBirthMonth("February");
            newPerson3.setHasPets(true);
            students.add(newPerson3);


            Person newPerson4 = new Person("Tim","Linkous");
            newPerson4.setFavBeverage("Water");
            newPerson4.setFavColor("Green");
            newPerson4.setBirthMonth("September");
            newPerson4.setHasPets(false);
            students.add(newPerson4);

            Person newPerson5 = new Person("Qian","Wang");
            newPerson5.setFavBeverage("Water");
            newPerson5.setFavColor("Blue");
            newPerson5.setBirthMonth("October");
            newPerson5.setHasPets(false);
            students.add(newPerson5);

            Person newPerson6 = new Person("Diptika","Devi");
            newPerson6.setFavBeverage("Tea");
            newPerson6.setFavColor("Orange");
            newPerson6.setBirthMonth("June");
            newPerson6.setHasPets(false);
            students.add(newPerson6);

            Person newPerson7 = new Person("Ian","Gordon");
            newPerson7.setFavBeverage("Water");
            newPerson7.setFavColor("Green");
            newPerson7.setBirthMonth("April");
            newPerson7.setHasPets(true);
            students.add(newPerson7);

            Person newPerson8 = new Person("Tim","Nguyen");
            newPerson8.setFavBeverage("Bubble Tea");
            newPerson8.setFavColor("White");
            newPerson8.setBirthMonth("November");
            newPerson8.setHasPets(true);
            students.add(newPerson8);

            Person newPerson9 = new Person("Bryan","Smith");
            newPerson9.setFavBeverage("Water");
            newPerson9.setFavColor("Brown");
            newPerson9.setBirthMonth("May");
            newPerson9.setHasPets(false);
            students.add(newPerson9);

            Person newPerson10 = new Person("Jonathan","Diehl");
            newPerson10.setFavBeverage("Coffee");
            newPerson10.setFavColor("Green");
            newPerson10.setBirthMonth("February");
            newPerson10.setHasPets(true);
            students.add(newPerson10);

            Person newPerson11 = new Person("Jared","Thacker");
            newPerson11.setFavBeverage("Water");
            newPerson11.setFavColor("Green");
            newPerson11.setBirthMonth("December");
            newPerson11.setHasPets(true);
            students.add(newPerson11);

            Person newPerson12 = new Person("Robbie","Niemeyer");
            newPerson12.setFavBeverage("Water");
            newPerson12.setFavColor("Blue");
            newPerson12.setBirthMonth("January");
            newPerson12.setHasPets(false);
            students.add(newPerson12);

            Person newPerson13 = new Person("Josue","Castro");
            newPerson13.setFavBeverage("Coffee");
            newPerson13.setFavColor("Blue");
            newPerson13.setBirthMonth("June");
            newPerson13.setHasPets(true);
            students.add(newPerson13);

            Person newPerson14 = new Person("Corey","Ross");
            newPerson14.setFavBeverage("Water");
            newPerson14.setFavColor("Black");
            newPerson14.setBirthMonth("October");
            newPerson14.setHasPets(false);
            students.add(newPerson14);

            Person newPerson15 = new Person("Will","Chapman");
            newPerson15.setFavBeverage("Water");
            newPerson15.setFavColor("Purple");
            newPerson15.setBirthMonth("December");
            newPerson15.setHasPets(false);
            students.add(newPerson15);

            // and so on for EACH person in the cohort.

            return students;
        }
        //...to here. Paste below the `getRecordFromLine()` method in Main.java



}
