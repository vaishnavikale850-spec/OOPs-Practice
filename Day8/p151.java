class Demo{
	public static void main(String[]args){	
		try{
			System.out.println(10/0);
			String s = null;
			s.length();
		}catch(NullPointerException e){
			System.out.print("string shikka ");
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("ganit shikka "+e.getMessage());
		}	
	}
}