package szamologep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main mainTest;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        ByteArrayInputStream in = new ByteArrayInputStream("vezerlo".getBytes());
        System.setIn(in);
        mainTest.main(new String[] {"vezerlo"});

    }
}