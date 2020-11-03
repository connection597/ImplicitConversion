package conversion;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //byte 형 값이 int형 변수에 대입됭ㅁ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 =20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
