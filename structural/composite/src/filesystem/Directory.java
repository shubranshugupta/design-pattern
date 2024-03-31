package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemEntry {
    private String name;
    private List<FileSystemEntry> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemEntry child) {
        children.add(child);
    }

    public void remove(FileSystemEntry child) {
        children.remove(child);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemEntry child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Directory[").append(name).append(" ").append(getSize()).append("]\n");
        for (FileSystemEntry child : children) {
            if (child instanceof File) {
                builder.append("  ").append(child).append("\n");
            } else {
                builder.append("  ").append(child.toString().replace("\n", "\n  ")).append("\n");
            }
        }

        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
    }

}
