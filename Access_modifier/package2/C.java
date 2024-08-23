package package2;
import package1.*;
public class C {
	//public = can be access in any package
	public String PublicMessage = "this is public";
	
	//protected = access only if the class extend to the subclass
	protected String protectedMessage = "this is protected";
	
	// default = access only within the same package
			String defaultMessage = "this is Default meassage";
	
	//private = access only withinthe same class
	private String privateMessage = "this is private message";
	
}
