package call.hello;

public class App
{

    private final String message = "Hell heyo World World form Java Maven Project!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
