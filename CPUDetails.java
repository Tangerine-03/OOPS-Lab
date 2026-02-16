class CPU
{
    double price=15000.0;
    class Processor
    {
        int cores=10;
        String manufacturer="Pentium";
    }
    static class RAM
    {
        double memory=64;
        String manufacturer="Intel";
    }
}
public class CPUDetails 
{
    public static void main(String args[])
    {
        CPU c=new CPU();
        CPU.Processor p=c.new Processor();
        CPU.RAM r=new CPU.RAM();
        System.out.println("CPU Class");
        System.out.println("---------");
        System.out.println("CPU Price:"+c.price);
        System.out.println("Processor Inner Class");
        System.out.println("---------------------");
        System.out.println("Number of cores:"+p.cores);
        System.out.println("Manufacturer="+p.manufacturer);
        System.out.println("RAM STatic Nested Class");
        System.out.println("-----------------------");
        System.out.println("Memory:"+r.memory);
        System.out.println("Manufacturer:"+r.manufacturer);
    }
}
