import java.util.ArrayList;
import java.util.List;

public class Time {
    private int id;

    private static List<Time> listaTime = new ArrayList<>();

    public Time(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void cadastrar(Time time) {
        listaTime.add(time);
    }

    public static List<Time> getListaTime() {
        return listaTime;
    }

    public static Time buscar(int id) {
        for (Time temp : listaTime) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
}
