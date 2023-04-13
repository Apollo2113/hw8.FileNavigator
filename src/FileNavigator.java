import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

    private final Map<String, List<FileData>> directories = new HashMap<>();
    public void add(FileData file) {
        directories.computeIfAbsent(file.getPath(), k -> new ArrayList<>()).add(file);
    }

    public List<FileData> find(String path) {
        return directories.get(path);
    }

}
