package Unit3;

public class Garage {

    private static Garage instance;

    private Garage()
    {

    }

    synchronized public static Garage getInstance()
    {
        if (instance == null)
        {
            instance = new Garage();
        }
        return instance;
    }
}
