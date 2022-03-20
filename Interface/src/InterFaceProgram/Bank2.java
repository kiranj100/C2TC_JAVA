package InterFaceProgram;

interface Bank
{  
	float rateOfInterest();  
}  
class SBI implements Bank
 {  
	  public float rateOfInterest()
		{
		  return 9.15f;
		}  
 }  
class PNB implements Bank
{  
	public float rateOfInterest()	
	  {
		 return 9.7f;
	  }  
}  
class Bank2
{  
	public static void main(String[] args)
	{  
		Bank b=new SBI();  
		Bank b1 = new PNB();
		System.out.println("ROI: "+b.rateOfInterest());  
		System.out.println("ROI: "+b1.rateOfInterest());  
	}
}  
