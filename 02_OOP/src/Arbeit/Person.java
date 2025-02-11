package Arbeit;

public abstract class Person {
    private String name;
    private int alter;
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    protected String getPersonToString(){
        String text = "Name: " + name;
        text = text + "\n\t" + "  Alter: " + alter;
        return text;
    }
    @Override
    public String toString() {
        return getPersonToString();
    }

}
