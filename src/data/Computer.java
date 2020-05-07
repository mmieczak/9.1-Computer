package data;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private GraphicCard graphicCard;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive, GraphicCard graphicCard) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\n cpu=" + cpu +
                "\n memory=" + memory +
                "\n hardDrive=" + hardDrive +
                "\n graphicCard=" + graphicCard +
                '}';
    }
}
