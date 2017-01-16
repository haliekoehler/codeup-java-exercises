import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HKoehler on 1/13/17.
 */
public class Collections {

    public static void main(String[] args){

            //Array Lists with types
            ArrayList<Integer> listOfNumbers = new ArrayList<>();
            ArrayList<String> nameOfCars = new ArrayList<>();

            //listOfNumbers[0] = 1; this is the wrong way
            listOfNumbers.add(11);
            listOfNumbers.add(22);


            System.out.println("Size of arrayList" + listOfNumbers.size());

            System.out.println(listOfNumbers.get(0));
            System.out.println(listOfNumbers.get(1));


            nameOfCars.add("Ford");
            nameOfCars.add("Nissan");
            nameOfCars.add("Honda");

            //System.out.println(nameOfCars.get(1));

            nameOfCars.clear();

            for (String car: nameOfCars) {
                System.out.println("car: "+ car);
            }


            listOfNumbers.add(0,1);


            //Lists without types

            List listCSV = new ArrayList();

            listCSV.add(0,1999);
            listCSV.add("Ford");
            listCSV.add(true);
            listCSV.add(34.46);
            listCSV.add(23L);

            List example = new ArrayList();
            example.add(2134);
            example.add("Fer");
            example.add(true);

            listCSV.addAll(example);

            for(int i=0;i<listCSV.size();i++){
                System.out.println("index "+i);
                System.out.println(listCSV.get(i));
            }

            //Maps

            Map person = new HashMap();

            person.put("age", 26);
            person.put("name", "Fer");
            person.put("hairColor", "Black");
            person.put("graduated", true);

            System.out.println(person.get("name"));
            System.out.println(person.get("age"));
            System.out.println(person.get("hairColor"));
            System.out.println(person.get("graduated"));

            //List of maps
            List<Map> persons = new ArrayList();

            persons.add(person);

            Map anotherPerson = new HashMap();

            anotherPerson.put("age", 28);
            anotherPerson.put("name", "Ana");
            anotherPerson.put("hairColor", "Blonde");
            anotherPerson.put("graduated", false);

            persons.add(anotherPerson);

            //System.out.println(person.keySet());

            for (Map student: persons) {
                System.out.println(student.get("name")+ " is " + student.get("age") + " years old, hair color is: "+student.get("hairColor"));
            }


            System.out.println("Maps lecture still continues");

        }

    }

