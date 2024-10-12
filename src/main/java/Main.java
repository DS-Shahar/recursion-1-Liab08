package Explorer;

public class Main {
	static double f(int n) {
		if(n==0) {
			return 1;
		}
		return n*f(n-1);
	}
	
	static double e(int n) {
		if(n==0) {
			return 1;
		}
		return 1/f(n)+e(n-1);
	}
	
	static double f1(int n) {
		if(n==1) {
			return 1;
		}
		return n+f1(n-1);
	}
	
	static double f2(int n) {
		if(n%2==1) {
			
			if(n==1) {
				
			    return 1;
		}
			
		    return n*f2(n-1);
		}
		return f2(n-1);
		
	}
	
	
	static int f3(int n) {
		n=n/10;
		if(n==0) {
			return 1;
		}
				
	  
		return 1+f3(n-1);
		
	}
	
	
	static int f4(int n,int r) {
		if(n-r<0) {
			return 0;
		}
		n=n-r;
		return 1+f4(n,r);
		
	}
	
	static int f5(int n,int r) {
		if(n-r<=0 ) {
			return r-n;
		}
		n=n-r;
		return f5(n,r);
		
	}
	
	
	static boolean f6(int n,int r) {
		if(n-r==0 ) {
			return true;
		}
		if(n-r<0) {
			return false;
		}
		n=n-r;
		return f6(n,r);
		
	}
	
	
	static boolean f7(int n,int a) {
		if(a==2 && f6(n,a)==false) {
			return true;
		}
		if(f6(n,a)==true) {
			return false;
		}
		return f7(n,a-1);
	}
	
	
	static boolean f8(int n) {
		if(n-n%10==0 || n-n%100==0) {
			return true;
			}
		if((n%10)%2!=(n%100-n%10)%2){
			return false;
		}
		n=n-n%10;
		return f8(n);	
		}
	
	
    public static void main(String[] args) {
    	System.out.println(f8(3323));
    }

}

