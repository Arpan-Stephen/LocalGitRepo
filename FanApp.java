class Fan
{
 String color;
    int cost;
    int no of blades;

void rotate()
{
System.out.println("Fan is rotating");
}

void blows air()
{
System.out.println("Fan is blowing air");
}
}

class FanApp
{
public static void main(String []args)
{
 Fan F1 = new Fan();
 Fan F2 = new Fan();
 Fan F3 = new Fan();

 F1.rotate();
 F1.blows air();

 F2.rotate();
 F2.blows air();

 F3.rotate();
 F3.blows air();
}
}


