package scenario_based;

import java.util.*;

public class GlobalShipmentManifestValidator {

	public static void main(String args[]) {
		
		
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    sc.nextLine();


		    for(int i = 0; i < n; i++) {
		        String s = sc.nextLine();

		        if(check(s)) {
		            System.out.println("COMPLIANT RECORD");
		        } 
		        else {
		            System.out.println("NON-COMPLIANT RECORD");
		        }
		    }
		
	}
public static boolean check(String s) {
	
	String a[]=s.split("\\|");
	if(!a[0].matches("SHIP-[1-9][0-9]{5}"))
	{
		return false;
	}
	
	String digits = a[0].substring(5);
	int count = 1;

	for(int i=1;i<digits.length();i++){
	    if(digits.charAt(i)==digits.charAt(i-1)){
	        count++;
	        if(count>3){
	            return false;
	        }
	    }else{
	        count=1;
	    }
	}
	if(!a[1].matches("\\d{4}-\\d{2}-\\d{2}")) {
		return false;  
	}
	
	String d[]=a[1].split("\\-");
	
	int y=Integer.parseInt(d[0]);;
	if(!(y>=2000 && y<=2099))
	{
		return false;
		
	}
	
	int m[]= {31,28,31,30,31,30,31,31,30,31,30,31};

	if((y%4==0 && y%100!=0) || y%400==0) {
	    m[1]=29;
	}

	int mon=Integer.parseInt(d[1]);
	int days=Integer.parseInt(d[2]);

	if(!(days>=1 && days<=m[mon-1])) {
	    return false;
	}
	
	List<String> mode=Arrays.asList("AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT");
	List<String> stat=Arrays.asList("DELIVERED" ,"CANCELLED","IN_TRANSIT");
	if(!mode.contains(a[2]))
	{
		return false;
	}
	
	
	Double w=Double.parseDouble(a[3]);
	
	if(!a[3].matches("(0|[1-9][0-9]{0,5})(\\.[0-9]{1,2})?"))
	{
		return false;
	}
	
	if(!(w>0 && w<=999999.99)) {
		return false;
	}
	
	if(!stat.contains(a[4])) {
		return false;
	}
	
	
	
	return true;

	}
}
