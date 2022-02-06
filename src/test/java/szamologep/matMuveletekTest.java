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
    void osszeadas() {
    }

    @Test
    @DisplayName("Összeadás teszt")
    void testOsszeadas() {
        assertEquals("10.0", mMuveletek.osszeadas("5","5") );
    }
}