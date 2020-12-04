package practise;

public class Animal {
    String name;
    int age;
    Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getTail() {
        return tail;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст:" + age +
                ", хвост: " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (getAge() != animal.getAge()) return false;
        if (!getName().equals(animal.getName())) return false;
        return getTail().equals(animal.getTail());
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getAge();
        result = 31 * result + getTail().hashCode();
        return result;
    }
}
