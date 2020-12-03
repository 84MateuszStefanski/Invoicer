package invoiceCreator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RegisterClientTest {

    @Test
    void shouldRegisterClient() {

        //given
        RegisterClient registerClient = new RegisterClient();
        Client client = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);

        //when
        registerClient.registerClient(client);

        //then
        assertThat(registerClient.getClientList().size()).isEqualTo(1);
    }

    @Test
    void shouldRegisterManyClients() {

        //given
        RegisterClient registerClient = new RegisterClient();
        Client client = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);
        Client client2 = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);
        Client client3 = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);
        Client client4 = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);

        //when
        registerClient.registerClient(client);
        registerClient.registerClient(client2);
        registerClient.registerClient(client3);
        registerClient.registerClient(client4);

        //then
        assertThat(registerClient.getClientList().size()).isEqualTo(4);
    }
}