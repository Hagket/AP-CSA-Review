class Derived extends Base
{
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }
    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }
    public void methodThree()
    {
        System.out.println("E");
    }
}