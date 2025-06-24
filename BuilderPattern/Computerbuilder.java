package BuilderPattern;

public interface Computerbuilder {
    Computerbuilder buildCPU(String CPU);
    Computerbuilder buildRAM(int RAM);
    Computerbuilder buildStorage(int storage);
    Computer build();
}
