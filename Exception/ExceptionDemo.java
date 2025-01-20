public class ExceptionDemo
{
  public static void main(String args[])
	{
	  int a=50;
	  for(int i=1;i<=20;i++)
		{
			int val=a/(a-i);
		}
	}
}

-------custom exception-------
----full fledge custom exception---

class UserException extends Exception
{
	---two constructor should be there
//method can be there

    public userException()
    {
	super();// it must call the super constructor
    }
    public userException(String msg)
    {
	super(msg); passing the string to the (
java.lang.Runtime)
    }

}

e.printStackTrace() ***

e.getMessage();

if catch block is used to easily identify whether it is checked or uncheked exception

if custom exception needs catch block then it is checked
else unchecked

------------------------------------------------

****jvm alwawys have the default exception handler***

1.it printStackTrace()
2.print the name and the reason behind the exception
3.terminate the progaram system.exit()
--------------------------------------------------



