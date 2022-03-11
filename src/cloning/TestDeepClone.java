package cloning;


class TestDeepClone{
public static void main(String[] args) throws CloneNotSupportedException {

    Address add = new Address("Pune","India",416202);

    Student s1 = new Student(1, "Shubhu",add);
    System.out.println("Original (S1) = "+s1);

    Student s2 = (Student) s1.clone();
    System.out.println("Cloned (S2) = "+s2);

    s1.add.city = "Kolhapur";

    System.out.println("S1 after change = "+s1);
    System.out.println("S2 after change in original = "+s2);

  

}
}
