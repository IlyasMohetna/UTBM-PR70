public class Person {
    private String surname;
    private String name;
    private int age;
    private float height;
    private float weight;

    public Person(String s,String n,int a,float h,float w){
        this.surname = s;
        this.name = n;
        this.age = a;
        this.height = h;
        this.weight = w;
    }

    public void setSurname(String n) {
        this.surname = n;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void birthday(){
        this.age = this.age + 1;
    }

    public static void main(String[] args) {
        Person UnePersonne = new Person("Lionel", "Messi", 40, 170, 65);
        System.out.println("L'age de cette personne est : " + UnePersonne.age);
        UnePersonne.birthday();
        System.out.println("L'age de cette personne dans un an est : " + UnePersonne.age);
    }
}
