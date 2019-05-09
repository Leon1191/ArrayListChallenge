import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void getOptions(){
    System.out.println("Choose in menu\n"+
            "0 - menu\n" +
            "1 - print contact list\n" +
            "2 - store contact\n" +
            "3 - modify contact\n"+
            "4 - remove contact\n"+
            "5 - find contact\n" +
            "9 - exit");
}


    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();


int menu;
boolean flag = true;

while(flag) {
    getOptions();
        menu = scanner.nextInt();
        scanner.nextLine();
switch (menu) {
    case 0:
        getOptions();
        break;
    case 1:
        mobilePhone.printContactList();
        break;
    case 2:
        System.out.println("Write name of contact");
        String name = scanner.nextLine();
        System.out.println("Write number of contact");
        String number = scanner.nextLine();
        mobilePhone.storeContact(name, number);
        break;
    case 3:
        System.out.println("Write old name of contact");
        String oldName = scanner.nextLine();
        System.out.println("Write new name of contact");
        String newName = scanner.nextLine();
        System.out.println("Write new number of contact");
        String newNumber = scanner.nextLine();
        System.out.println(oldName + ""+newName+""+newNumber);
        mobilePhone.modifyContact(oldName, newName,newNumber);
        break;
    case 4:
        System.out.println("Write name of contact for remove");
        String removeName = scanner.nextLine();
        mobilePhone.removeContact(removeName);
        break;
    case 5:
        System.out.println("Write name of contact for found");
        String findName = scanner.nextLine();
        System.out.println("finding name was "+ findName);
        mobilePhone.findContact(findName);
        break;
    case 9: flag = false;
        break;
}
}
    }
}