
public class Main {
    public static void main(String[] args) {
        FileData file1 = new FileData("file1", 16, "/path/to/file1");
        FileData file2 = new FileData("file2", 8, "/path/to/file2");
        FileData file3 = new FileData("file3", 2, "/path/to/file3");

        FileNavigator directories = new FileNavigator();

        directories.add(file1, "/path/to/file1");
        directories.add(file2, "/path/to/file2");
        directories.add(file3, "/path/to/file3");

        System.out.println(directories);

        System.out.println(directories.find("/path/to/file2"));

        System.out.println(directories.filterBySize(10));

        System.out.println(directories.sortBySize());

        directories.remove("/path/to/file2");
        System.out.println(directories);

    }
}