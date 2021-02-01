package com.add;

import java.util.*;

public class AddressBookMain {
    ArrayList<ContactOfPerson> al=null;
    AddressBookMain(){
        al= new ArrayList<>();
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of ContactDetails");
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the Last name");
        String lastName = sc.next();
        System.out.println("Enter the Address");
        String address = sc.next();
        System.out.println("Enter the City");
        String city = sc.next();
        System.out.println("Enter the State");
        String state = sc.next();
        System.out.println("Enter the ZipCode");
        String zipCode = sc.next();
        System.out.println("Enter the contact number...");
        String phoneNumber = sc.next();

        al.add( new ContactOfPerson(firstName, lastName, address, city, state, zipCode, phoneNumber));
    }

    public void edit(ContactOfPerson ContactDetails) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Address");
        ContactDetails.address = sc.next();
        System.out.println("Enter the City");
        ContactDetails.city = sc.next();
        System.out.println("Enter the State");
        ContactDetails.state = sc.next();
        System.out.println("Enter the ZipCode");
        ContactDetails.zip = sc.next();
        System.out.println("Enter the contact number...");
        ContactDetails.phoneNo = sc.next();


    }

    public void delete(ContactOfPerson Contact) {

        al.remove(Contact);

    }

    static void menu() {
        ContactOfPerson ContactDetails = null;
        AddressBookMain ab=new AddressBookMain();
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ab.add();
                    break;
                case 2:

                    System.out.println("Enter the ContactDetails Name to edit details..");
                    String firstName = sc.next();
                    ArrayList <ContactOfPerson> personList= ab.al;
                    for (int i=0;i<personList.size();i++) {
                        if (personList.get(i).firstName.equals(firstName)) {
                            ContactOfPerson ContactDetail = personList.get(i);

                            ab.edit(ContactDetail);

                        } else {
                            System.out.println(firstName + " is not exists ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the ContactDetails name to Delete the Details");
                    firstName = sc.next();
                    ArrayList <ContactOfPerson> personLists= ab.al;
                    for (int i=0;i<personLists.size();i++) {
                        if (personLists.get(i).firstName.equals(firstName)) {
                            ContactOfPerson Contact =personLists.get(i);
                            ab.delete(Contact);
                        }
                    }

                    break;

                case 4:
                    System.out.println(ab.al);
                    break;
                default:
                    System.out.println("Enter num from 1 to 4");
            }
        } while (choice<5);
    }

    public static void main(String[] args) {
        menu();
    }

}

