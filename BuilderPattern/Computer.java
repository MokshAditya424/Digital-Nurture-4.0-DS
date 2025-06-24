package BuilderPattern;

public class Computer {
    private String CPU;
    private int RAM;
    private int storage;

    // Private constructor accessed from Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    // Getters
    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    // toString() for display
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;

        public Builder buildCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder buildRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder buildStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

