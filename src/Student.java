public class Student {
    private String name = "";
    private int age = 0;
    private int averege = 0;
    private int shomareDaneshjo = 0;

    public Student setName(String name) {
        this.name = name;

        return this;
    }

    public Student setAge(int age) {
        this.age = age;

        return this;
    }


    public Student setAverege(int value) {
        this.averege = value;

        return this;
    }


    public Student setShomare(int value) {
        this.shomareDaneshjo = value;

        return this;
    }

    public Student build()
    {
        Student s = new Student();
        s.shomareDaneshjo = shomareDaneshjo;
        s.averege = averege;
        s.age = age;
        s.name = name;
        return s;
    }


    @Override
    public String toString() {
        return name + " "+ averege + " " + shomareDaneshjo + " " + age;
    }
}
