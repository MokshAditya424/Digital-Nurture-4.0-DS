package BuilderPattern;

public class DeskTopComputerBuilder implements Computerbuilder {
    private Computer.Builder builder;

    public DeskTopComputerBuilder() {
        builder = new Computer.Builder();
    }

    public Computerbuilder buildCPU(String CPU) {
        builder.buildCPU(CPU);
        return this;
    }

    public Computerbuilder buildRAM(int RAM) {
        builder.buildRAM(RAM);
        return this;
    }

    public Computerbuilder buildStorage(int storage) {
        builder.buildStorage(storage);
        return this;
    }

    public Computer build() {
        return builder.build();
    }
}

