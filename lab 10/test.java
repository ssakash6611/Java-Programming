public class test
{
  public static void main (String[]args)
  {
    student John= new student();
    John.setName("John");
    System.out.println(John.getName());
    John.setID("1320100015");
    System.out.println(John.getID());
    John.setAddress("Mohakhali");
    System.out.println(John.getAddress());
    John.setCGPA(4.00);
    System.out.println(John.getCGPA());
    System.out.println();
    
    student Mike= new student();
    Mike.setName("Mike");
    System.out.println(Mike.getName());
    Mike.setID("1320100014");
    System.out.println(Mike.getID());
    Mike.setAddress("Gulshan");
    System.out.println(Mike.getAddress());
    Mike.setCGPA(2.0);
    System.out.println(Mike.getCGPA());
    System.out.println();
    
    student Carol= new student();
    Carol.setName("Carol");
    System.out.println(Carol.getName());
    Carol.setID("1320100013");
    System.out.println(Carol.getID());
    Carol.setAddress("Uttra");
    System.out.println(Carol.getAddress());
    Carol.setCGPA(3.0);
    System.out.println(Carol.getCGPA());
  
  
  }
}

