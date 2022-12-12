package tasks7;

import java.util.Arrays;

public class Folder {
    private String name;
    private File[] files;
    private int filesNum;


    public Folder(String name) {
        this.name = name;
        this.files = new File[0]; 
        this.filesNum = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File[] getFiles() {
        return this.files;
    }

    public int getFilesNum() {
        return this.filesNum;
    }

    public void addFile(File file) {
        File newarr[] = new File[getFilesNum() + 1];
        for (int i = 0; i < getFilesNum(); i++)
            newarr[i] = getFiles()[i];

        newarr[getFiles().length] = file;
        this.files = newarr;
        this.filesNum++;
    }

    public File[] removeFile(String fileName) {
        File[] newarr = new File[getFilesNum() - 1];
        int j = 0;
        for (int i = 0; i < getFilesNum(); i++) {
            if (getFiles()[i].getName().equals(fileName)) {
                continue;
            }
            newarr[j] = getFiles()[i];
            j++;
        }

        this.files = newarr;
        this.filesNum--;
        return this.files;
    }

    public String toString() {
        return
                "Folder name: " + getName() +
                        "\nAll files: " + Arrays.toString(getFiles()) +
                        "\nFiles number: " + getFilesNum();
    }

}