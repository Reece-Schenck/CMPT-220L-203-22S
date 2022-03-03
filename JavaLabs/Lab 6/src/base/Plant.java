package base;

public class Plant {
    String name;
    String plantFamily;
    String needsWatering;

    public Plant(String name, String plantFamily, String needsWatering) {
        this.name = name;
        this.plantFamily = plantFamily;
        this.needsWatering = needsWatering;
        wateringInstructions();
        sunlightRequirements();
    }

    public void wateringInstructions(){
        System.out.println("Water once daily");
    }

    public void sunlightRequirements(){
        System.out.println("Requires 8 hours of sunlight daily");
    }
}
