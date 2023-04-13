import java.util.*;

public class FileNavigator {

    private final Map<String, List<FileData>> directories = new HashMap<>();
    public void add(FileData file) {
        directories.computeIfAbsent(file.getPath(), k -> new ArrayList<>()).add(file);
    }

    public void add(FileData file, String path) {
        if (!file.getPath().equals(path)) {
            System.out.println("Incorrect path ");
        }
        add(file);
    }

    public List<FileData> find(String path) {
        return directories.get(path);
    }

    public List<FileData> filterBySize(int size) {
        return directories.values().stream()
                .flatMap(Collection::stream)
                .filter(e -> e.getSize() < size)
                .toList();
    }

    public void remove(String path) {
        directories.remove(path);
    }

    public List<FileData> sortBySize() {
        return directories.values().stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(FileData::getSize))
                .toList();
    }

}
