package lambda_expressions;

interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motion = () ->
            System.out.println("Lights ON - Motion detected");

        LightAction night = () ->
            System.out.println("Dim lights - Night mode");

        LightAction voice = () ->
            System.out.println("Lights ON - Voice command");

        motion.activate();
        night.activate();
        voice.activate();
    }
}

