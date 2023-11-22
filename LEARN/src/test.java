
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String essay="geeks quiz practice code” ";
		
		StringBuilder plus= new StringBuilder(essay);
		//plus.append("mother");
		//System.out.println(plus);
		plus.reverse();
		System.out.println(plus);
		plus.deleteCharAt(3).insert(3, 'M');
		System.out.println(plus);
	}

}
