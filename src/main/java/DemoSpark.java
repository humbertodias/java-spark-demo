import static spark.Spark.*;

public class DemoSpark {
    public static void main(String[] args) {

        get("/demo", (req, res) -> "Spark - A micro framework for creating web applications in Java 8 with minimal effort");

    }
}