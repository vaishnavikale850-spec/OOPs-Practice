/* valueOf() = this function takes binary value and base value as paramter and return object and by using intValue() method it get converted into integer data type .
 this same work for Float, Charater, Double, Long ,Byte wrapper classes in java.

parseFloat() , floatValue(), Float.valueOf("int binary value", 2);
*/

class Demo{
	public static void main(String[]args){
		Integer il = Integer.valueOf("10101");
		int x = il.intValue();
		System.out.println(x);

		Double il1 = Double.valueOf("10110");// number passes that can be converted into double data type.
		double y = il1.doubleValue();
		System.out.println(y);
	}
}
