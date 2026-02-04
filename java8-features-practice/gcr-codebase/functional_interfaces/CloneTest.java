package functional_interfaces;

class Carss implements Cloneable {
    String model;

    Carss(String model) {
        this.model = model;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws Exception {

        Carss c1 = new Carss("BMW");
        Carss c2 = (Carss) c1.clone();

        System.out.println(c2.model);
    }
}

