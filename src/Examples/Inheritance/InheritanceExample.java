package Examples.Inheritance;

public class InheritanceExample {
    /**
     * 1) Java'da class'lar arasında parent-child relationship vardır.
     * 2) Parent Class'a "super class" da denir. Child Class'a "sub class" da denir.
     * 3) Ortak özellikler parent class'a, specific özellikler  child class'a yazılır.
     * 4) Parent Child Relationship "reusability", "maintenance",   "less code", "well organization" açılarından faydalıdır.
     * 5) Child classlar parent'lardaki her methodu ve variable'i kullanabilir ama parent class child'dakileri kullanamaz.
     * 6) Java "Multiple Inheritance"'i desteklemez. Yani; Java'da bir Child Class'in 1'den fazla parent'i olamaz.
     * 7) Bir parent class, 1'den fazla child class ile oluşturulan parent child relationship'e "Hierarchical Inheritance"  denir.
     * 8) Child-Parent-Grandparent... şeklinde oluşturulan çok katli parent child relationshipe'e multi-level inheritance denir.
     * 9) "Object Class" bütün classlarin parent class'idir.  Java'da parent class'i olmayan tek class "Object Class"dir
     * <p>
     * 1) There is a parent-child relationship between classes in Java.
     * 2) Parent Class is also called "super class". Child Class is also called "sub class".
     * 3) Common properties are written to the parent class, specific properties are written to the child class.
     * 4) Parent Child Relationship is beneficial in terms of "reusability", "maintenance", "less code" and "well organization".
     * 5) Child classes can use any method and variable in parent's, but not those in parent class child.
     * 6) Java does not support "Multiple Inheritance". So; A Child Class cannot have more than 1 parent in Java.
     * 7) A parent child relationship created with a parent class, more than 1 child class is called "Hierarchical Inheritance".
     * 8) The multi-layer parent child relationship created in the form of Child-Parent-Grandparent ... is called multi-level inheritance.
     * 9) "Object Class" is the parent class of all classes. The only class that does not have a parent class in Java is "Object Class".
     */
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();
        a1.eat();
        a1.drink();

        System.out.println("================");

        Feed m1 = new Feed();
        m1.birth();
        m1.feedWithMilk();
        m1.drink();
        m1.eat();
        m1.move();

        System.out.println("================");

        Cat c1 = new Cat();
        c1.meow();
        c1.birth();
        c1.feedWithMilk();
        c1.eat();
        c1.move();

        System.out.println("================");

        Dog d1 = new Dog();
        d1.bark();
        d1.birth();
        d1.feedWithMilk();
        d1.eat();
        d1.drink();
        d1.move();

        System.out.println("================");

        Fish f1 = new Fish();
        f1.egg();
        f1.move();
        f1.eat();
        f1.drink();
    }
}
