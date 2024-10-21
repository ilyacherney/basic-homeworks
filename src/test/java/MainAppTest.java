import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.ilyacherney.homeworks.homework29.MainApp;

import static ru.otus.ilyacherney.homeworks.homework29.MainApp.getElementsAfterLastOne;
import static ru.otus.ilyacherney.homeworks.homework29.MainApp.hasOnlyOnesAndTwos;


public class MainAppTest {

    @Test
    public void getElementsAfterLastOneTest() {
        int[] arrIn = new int[]{1, 2, 1, 2, 2};
        int[] arrExpected = new int[] {2, 2};
        int[] arrActual = getElementsAfterLastOne(arrIn);
        Assertions.assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void getElementsAfterLastOneThrowsExceptionTest() {
        int[] arrIn = new int[]{2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.getElementsAfterLastOne(arrIn));
    }

    @Test
    public void hasOnlyOnesAndTwosTest() {
        Assertions.assertTrue(hasOnlyOnesAndTwos(new int[] {1, 2}));
        Assertions.assertFalse(hasOnlyOnesAndTwos(new int[] {1, 1}));
        Assertions.assertFalse(hasOnlyOnesAndTwos(new int[] {1, 3}));
        Assertions.assertTrue(hasOnlyOnesAndTwos(new int[] {1, 2, 2, 1}));
    }
}
