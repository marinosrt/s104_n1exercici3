package Main;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static List<String> addClients() throws ArrayIndexOutOfBoundsException {
        List<String> listClients = new ArrayList<>();
        listClients.add("Mercedes Cuevas");
        listClients.add("Pepito Flores");
        listClients.add("Pepe Rubianes");

        if (listClients.size() == 0){
            throw new ArrayIndexOutOfBoundsException("Can't add more clients");
        }

        return listClients;
    }
}
