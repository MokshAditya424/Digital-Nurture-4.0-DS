package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        // Direct builder usage
        Computer gamingPC = new Computer.Builder()
                .buildCPU("Intel i9")
                .buildRAM(32)
                .buildStorage(1000)
                .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Using DesktopComputerBuilder (optional)
        Computer officePC = new DeskTopComputerBuilder()
                .buildCPU("Intel i5")
                .buildRAM(16)
                .buildStorage(512)
                .build();

        System.out.println("Office PC: " + officePC);
    }
}

