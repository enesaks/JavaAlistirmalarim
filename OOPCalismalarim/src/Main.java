
public class Main {

    public static void main(String[] args) {

        /*
        User u1 = new User();
        u1.name = "Enes";
        u1.job = "Computer Engineering";
        User u2 = new User();
        u2.name = "Ahmet";
        u2.job = "Doctor";
        */

        User u1 = new User("Ahmet", "Doctor");
        System.out.println(u1.information());

        Musician m1 = new Musician("Mehmet","Guitar",34);
        //System.out.println(m1.instrument);

        //Encapsulation
        m1.setAge(40);
        System.out.println(m1.getAge());
        //Intheritance
        superMusician sm1 = new superMusician("ahmet","piano",35);
        System.out.println(sm1.sing());
        System.out.println(sm1.getName());
        //Polymorphism

        //Static Polymorphism
        Mathematics math = new Mathematics();
        System.out.println(math.sum());
        System.out.println(math.sum(1,2));
        System.out.println(math.sum(1,2,3));
        //Dynamic Polymophisim
        Animal a1 = new Animal();
        a1.sing();

        Dog d1 = new Dog();
        d1.test();
        d1.sing();


        Piano p1 = new Piano();

        p1.brand  ="yamaha";
        p1.digital = true;
        p1.info();





    }
}