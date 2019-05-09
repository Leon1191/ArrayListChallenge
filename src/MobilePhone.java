import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public void storeContact(String name, String number) {
        contactList.add(Contacts.addContact(name,number));

    }

    public void modifyContact(String oldName, String newName, String newNumber) {
        int position = queryContact(oldName);
        if (position >= 0) {
            contactList.set(position, new Contacts(newName, newNumber));
        }
    }

    public void removeContact(String name){
    int position = queryContact(name);
    if (position >= 0){
        contactList.remove(position);
    }
}

    private int queryContact(String name) {

        for(int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).getName().equals(name)){return i;}
        }

       return -1;
    }

    public void findContact(String name) {
        int position = queryContact(name);
        if (position >= 0) {
            System.out.println("Contact was found, it was " + contactList.get(position).getName()+ " with telephone " + contactList.get(position).getNumber());
        }
        else{
        System.out.println("not found");}
    }

    public void printContactList(){
        for(int i = 0; i < contactList.size(); i++){
            System.out.println(contactList.get(i).getName() + " " + contactList.get(i).getNumber());
        }
    }


}

