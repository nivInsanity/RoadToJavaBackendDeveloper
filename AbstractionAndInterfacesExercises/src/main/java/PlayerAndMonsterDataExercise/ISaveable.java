package PlayerAndMonsterDataExercise;

import java.util.List;

public interface ISaveable {
    List<String> write();
    List<String> read(List<String> valuesToRead);
}
