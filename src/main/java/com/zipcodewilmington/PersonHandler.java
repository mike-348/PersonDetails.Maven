package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        int counter = 0;
        String result = "";
        Person[] pArr = new Person[personArray.length];
        while (counter < personArray.length) {
            Person currentPerson = personArray[counter];
            String strPerson = currentPerson.toString();
            result += strPerson;
            counter++;
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        int counter = 0;
        Person[] pArr = new Person[personArray.length];
        for (int i = 0; i < personArray.length; i++) {
           Person currentPerson = personArray[counter];
           result += currentPerson;
           counter++;
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        Person[] pArr = new Person[personArray.length];
        for (Person p : personArray) {
            String currentPerson = p.toString();
            result += currentPerson;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
