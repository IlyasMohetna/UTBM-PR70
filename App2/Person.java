package App2;

public class Person {
    String surname;
    String name;
    Integer age;
    float height;
    float Weight;

    public Person(String surname, String name, Integer age, float height, float Weight) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.height = height;
        this.Weight = Weight;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public void birthday()
    {
        this.setAge(this.getAge() + 1);
    }

    public static void main(String[] args) {
        Person Person = new Person("Messi", "Lionel", 38, 170, 67.0f);
        System.out.println("Le nom de cette personne est : "+ Person.getName());
        System.out.println("Le prenom de cette personne est : "+ Person.getSurname());
        System.out.println("L'age de cette personne est : "+ Person.getAge());
        System.out.println("La taille de cette personne est : "+ Person.getHeight());
        System.out.println("Le poids de cette personne est : "+ Person.getWeight());
        Person.birthday();
        System.out.println("L'age de cette personne dans un an est : "+ Person.getAge());
    }
    
}
