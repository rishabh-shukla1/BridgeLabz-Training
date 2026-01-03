package inheritance;

class Personn
{
    String name;
    int id;

    Personn(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo()
    {
        System.out.println("Name:-" + name);
        System.out.println("ID:-" + id);
    }
}

//Interface
interface Worker
{
    void performDuties();
}

//Chef class
class Chef extends Personn implements Worker
{
    String speciality;

    Chef(String name, int id, String speciality)
    {
        super(name, id);
        this.speciality = speciality;
    }

    public void performDuties()
    {
        System.out.println("Chef is preparing " + speciality + " dishes");
    }

    void displayInfo()
    {
        System.out.println("Role:-Chef");
        displayPersonInfo();
        System.out.println("Speciality:-" + speciality);
        performDuties();
    }
}

//Waiter class
class Waiter extends Personn implements Worker
{
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned)
    {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties()
    {
        System.out.println("Waiter is serving " + tablesAssigned + " tables");
    }

    void displayInfo()
    {
        System.out.println("Role: Waiter");
        displayPersonInfo();
        System.out.println("Tables Assigned:-" + tablesAssigned);
        performDuties();
    }
}

//Main class
public class RestaurentSystem
{
    public static void main(String[] args)
    {
        Chef c = new Chef("Ramesh", 101, "Chinese");
        Waiter w = new Waiter("Suresh", 102, 6);

        System.out.println();
        c.displayInfo();

        System.out.println();
        w.displayInfo();
    }
}