public class Book {
    private String title;
    private int pagesNum;
    private String type;
    private String[] aviableTypes = {"crime", "drama", "fantasy", "science fiction"};


    public boolean checkType(String type){
        for(String el : this.aviableTypes){
            if(type == el){
                return true;
            }
        }return false;
    }

    public Book(String title, int pagesNum, String type) {
        this.title = title;
        this.pagesNum = pagesNum;
        if(checkType(type)){
            this.type = type;
        }       
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNum() {
        return this.pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        if(checkType(type)){
            this.type = type;
        }   
    }

    public String toString() {
        return "{" +
            "title='" + getTitle() + "'" +
            ", pagesNum='" + getPagesNum() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
    

}
