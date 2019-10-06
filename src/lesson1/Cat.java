package lesson1;

public class Cat {

    private static String jumping;
    private static Object Cat;
//    private final String jumping;
    
    public static void main(String[] args) {
        Cat cat = new Cat("Прыгает");
        System.out.println(Cat);
    }

    public Cat(String jumping) {
        this.jumping = "Прыгает!";
    }

    public void catInfo() {
        System.out.println("Кот " + jumping);
    }

    public String getJumping() {
        return jumping;
    }


}
