package tasks7;

public class Processor {
    
    private String processorBrand;
    private String model;
    private String material;
    private int numberOfCores;
    private int memoryRAM;

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public String toString() {
        return "Processor [brandProcessor=" + processorBrand + ", model=" + model + ", material=" + material
                + ", numberOfCores=" + numberOfCores + ", memoryRAM=" + memoryRAM + "]";
    }
    

    public Processor(String brandProcessor, String model, String material, int numberOfCores, int memoryRAM) {
        setProcessorBrand(brandProcessor);
        setModel(model);
        setMaterial(material);
        setNumberOfCores(numberOfCores);
        setMemoryRAM(memoryRAM);
    }

    public static void main(String[] args){
        Processor p1 = new Processor("Apple", "M1", "material", 20, 16);
        System.out.print(p1);
    
    }
}