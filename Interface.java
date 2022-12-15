#lab
interface animal{
	void eat();
	void sleep();
}
 class lion implements animal
{
	 @Override
	public void eat() 
	 {
		System.out.println("i'm king i eat meets");
	 }
	 @Override
	 public void sleep()
	 {
		 System.out.println("i'm king i sleep");
	 } 
}
 class rabits implements animal
 {
	 @Override
	 public void eat() {
			System.out.println("i'm king i eat veg");
		}
		 @Override
		 public void sleep()
		 {
			 System.out.println("i'm king i sleep");
		 }
 }
 class zoo
 {
	 public static void createInstance(animal aa)
	 {
		 aa.eat();
		 aa.sleep();
	 }
 }
public class interface1 {

	public static void main(String[] args)
	{
        String data = args[0];
        if( data.equalsIgnoreCase("lion"))
        		{
        	      zoo.createInstance(new lion());
        }else if(data.equalsIgnoreCase("rabits"))
        {
        	zoo.createInstance(new rabits());
        }else {
        	try {
        		zoo.createInstance(null);
        	}catch(NullPointerException ne)
        	{
        		System.out.println("wrong input !!!");
        	}
       } 
	}

}
