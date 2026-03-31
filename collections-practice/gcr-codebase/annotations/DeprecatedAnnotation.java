package annotations;

class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature (deprecated).");
    }

    public void newFeature() {
        System.out.println("This is the new feature.");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // Compiler warning
        api.newFeature();   // Recommended
    }
}
