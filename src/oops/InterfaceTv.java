package oops;

interface Tvremote
{
	public void Volumeup(); 
	public void Volumedown();	
}

interface SmartTv extends Tvremote
{
	public void poweroff();
	public void poweron();			
}

class Tv implements SmartTv
{
	@Override
	public void Volumeup() 
	{
		System.out.println("Tv Volume Up");		
	}

	@Override
	public void Volumedown() 
	{
		System.out.println("Tv Volume Down");
	}

	@Override
	public void poweron() 
	{
		System.out.println("Tv Power On");
	}
	
	@Override
	public void poweroff() 
	{
		System.out.println("Tv Power Off");
	}
}
class Andtv extends Tv
{
	@Override
	public void Volumeup() 
	{
		System.out.println("Android Tv Volume Up");		
	}

	@Override
	public void Volumedown() 
	{
		System.out.println("Android Tv Volume Down");
	}

	@Override
	public void poweron() 
	{
		System.out.println("Android Tv Power On");
	}
	
	@Override
	public void poweroff() 
	{
		System.out.println("Android Tv Power Off");
	}
}
public class InterfaceTv 
{
	public static void main(String[] args) 
	{
		SmartTv ob=new Tv();
		ob.Volumeup();
		ob.Volumedown();
		ob.poweron();
		ob.poweroff();
		ob=new Andtv();
		ob.Volumeup();
		ob.Volumedown();
		ob.poweron();
		ob.poweroff();
	}
}
