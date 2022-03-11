package cloning;

public class Student implements Cloneable {

    int roll;
    String name;
    Address add;

    public Student() {
    }

    public Student(int roll, String name, Address add) {
        this.roll = roll;
        this.name = name;
        this.add = add;
    }

    

    @Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}

	@Override
    protected Object clone() throws CloneNotSupportedException {
    Student dummyStd = (Student) super.clone(); 
    Address addr = (Address) add.clone(); 
    dummyStd.add = addr; 
    return dummyStd; 

    }
}