package com.behavioral.Observer.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Exec {

    public static void main(String[] args) {
        //Instnace of the product
        Product phone = new Product("Banana Phone");

        //Person Observable
        Person khalid = new Person("khalil");
        Person sami = new Person("maghraoui");
        Person busrha = new Person("hamza");

        //Company Observable
        Company company = new Company("morocco.com", "123 asilah street");

        //Add the observers
        phone.addObserver(khalid);
        phone.addObserver(sami);
        phone.addObserver(busrha);

        phone.addObserver(company);

        //Simple loop
        for (int i = 0; i < 5; i++) {
            //Example of removing obsever
            if (i == 2) {
                phone.removeObserver(sami);
            }

            //Set avaibality based on the i value (Just for demo)
            boolean avaiable = i % 2 == 0;
            phone.setAvailablity(avaiable);

            //Simple delay for printing out the data.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }

            System.out.println("--------------------------------");
        }

    }
}
