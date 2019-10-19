package lesson1;

public class Cat {

    private static String jumping;
    private static Object Cat;

    public static void main(String[] args) {
        Cat cat = new Cat("Прыгает!");
        System.out.println(Cat);
    }

    private Cat(String jumping) {
        lesson1.Cat.jumping = "Прыгает!";
    }

    public void catInfo() {
        System.out.println("Кот " + jumping);
    }

    public String getJumping() {
        return jumping;
    }


}
