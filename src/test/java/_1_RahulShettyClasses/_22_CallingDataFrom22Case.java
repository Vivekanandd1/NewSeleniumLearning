package _1_RahulShettyClasses;

import java.io.IOException;
import java.util.ArrayList;

public class _22_CallingDataFrom22Case {
	public static void main(String[] args) throws IOException {
		_22_ExcelDataDrivenTests Data = new _22_ExcelDataDrivenTests();
		ArrayList<String>dd = Data.getdata("virtual");
		System.out.println(dd.get(0));
		System.out.println(dd.get(1));
        System.out.println(dd.get(2));
 		System.out.println(dd.get(3));
		
	}
}
