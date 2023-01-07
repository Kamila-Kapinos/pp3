package mock3;

import java.util.ArrayList;

public class Cities {
    String[] cities;

    public Cities(String[] newList) {
        this.cities = newList;
    }

    public String[] getCities() {
        return this.cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public Cities filter(char letter){

        ArrayList<String> newList = new ArrayList<String>();
        for(int i = 0; i<getCities().length; i++){
            if(getCities()[i].toCharArray()[0] == letter){
                newList.add(getCities()[i]);
            }
        }
        Cities c = new Cities(newList.toArray(new String[newList.size()]));
        return c;
    }

    public String cities(){
        String cities = "";
        for(String el : getCities()){
            cities+=el;
        }
        return cities;
    }
}
