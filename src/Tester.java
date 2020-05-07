import data.*;

public class Tester {
    public static void main(String[] args) {

        CPU cpu = new CPU("Core i9-9900K", "Intel", "ABS123456", 3600, 60, 60, 100);
        Memory memory = new Memory("G.Skill Ripjaws", "G.Skill", "DX666666", 3600, 40, 40, 120, 16000);
        HardDrive hardDrive = new HardDrive("SX8200 PRO", "ADATA", "XX8234-213-A", 2048);
        GraphicCard graphicCard = new GraphicCard("RTX 2080 TI Extreme", "Zotac", "GG000923", 1350, 50, 50, 110, 11000, "GDDR6 352-bit");

        Computer computer = new Computer(cpu, memory, hardDrive, graphicCard);

        //2 errors, one successfull overclock for memory
        System.out.println("OVERCLOCKING RESULT:");
        computer.getCpu().setNewClock(38000);
        computer.getMemory().setNewClock(3800);
        computer.getGraphicCard().setNewClock(4000);

        System.out.println("\nCOMPUTER COMPONENTS:");
        System.out.println(computer.toString());
    }
}
