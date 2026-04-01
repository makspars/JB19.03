public class Computer {
    int ssd;
    int cpu;
    String Brand;
    private int gpu;
    Computer() {};
    Computer(int defSsd,int defCpu,String defBrand) {
        ssd = defSsd;
        cpu = defCpu;
        Brand = defBrand;
    }
    void isCpu(){
        System.out.println(cpu);
    }
    void isSsd(){
        System.out.println(ssd);
    }
void getGpu(){
    System.out.println(gpu);
}
    void getBrand(){
        System.out.println(Brand);
    }
void setgpu (int g) {
    gpu = g;
}
    void setBrand (String b) {
        Brand = b;
    }
}
