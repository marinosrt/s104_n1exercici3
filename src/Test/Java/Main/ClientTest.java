package Main;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {

    List<String> listClients = new ArrayList<>();

    @BeforeEach
    void begin(){
        listClients = Client.addClients();
    }

    @Test
    void test(){
        assertTrue(listClients != null);
    }


}