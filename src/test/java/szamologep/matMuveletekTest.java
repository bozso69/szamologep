package szamologep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class matMuveletekTest {
    matMuveletek  mMuveletek;

    @BeforeEach
    void setUp() {
        mMuveletek = new matMuveletek();
    }

    @AfterEach
    void tearDown() {
        mMuveletek = null;
    }

    @Test
    @DisplayName("Összeadás teszt")
    void testOsszeadas() {
        assertEquals("10.0", mMuveletek.osszeadas("5","5"));
    }

    @Test
    @DisplayName("Kivonás teszt")
    void kivonas() {
        assertEquals("10.0", mMuveletek.kivonas("20","10"));
        assertEquals("-10.0", mMuveletek.kivonas("20","30"));
    }


    @Test
    @DisplayName("Szorzás teszt")
    void sorzas() {
        assertEquals("200.0", mMuveletek.sorzas("20","10"));
        assertEquals("-200.0", mMuveletek.sorzas("20","-10"));
    }

    @Test
    @DisplayName("Osztás teszt")
    void osztas() {
        assertEquals("2.0", mMuveletek.osztas("20","10"));

    }
}