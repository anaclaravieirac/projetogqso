import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    Banco bd = new Banco();
    @Test
    void deposito() {
        assertEquals(false, bd.deposito(-100));
    }
    @Test
    void saque() {
        assertEquals(false, bd.saque(0));
    }
    @Test
    void saldo() {

    }
}