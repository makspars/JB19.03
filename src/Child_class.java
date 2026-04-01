public class Child_class extends Parent_class{

    public Child_class(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }

    void mu () {
        System.out.println(getSay() + " во все " + getTeeth() + " зубов");
    }
}
