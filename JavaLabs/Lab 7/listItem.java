public class listItem {
    int value;
    listItem listItem;

    public listItem(int value, listItem listItem){
        this.value = value;
        this.listItem = listItem;
        getValue();
    }

    public int getValue(){
        return value;
    }
}