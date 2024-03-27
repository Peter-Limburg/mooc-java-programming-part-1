
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class exManTest {

        @Test    public void exerciseListEmptyAtBeginning() {

            ExerciseManagement management = new ExerciseManagement();
            assertEquals(0, management.exerciseList().size());

        }
    }

