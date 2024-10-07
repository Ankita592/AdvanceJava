package in.co.rays.test;

import in.co.rays.bean.MarksheettBean;
import in.co.rays.model.MarksheettModel;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		testAdd();
		
		
		
	}
	
	
	
	public static void testAdd() throws Exception
	
	{
		MarksheettBean bean = new MarksheettBean();
		bean.setId(1);
		bean.setRollNo(1000);
		bean.setName("Khushi Gupta");
		bean.setPhysics(10);
		bean.setChemistry(9);
		bean.setMaths(8);
		
		MarksheettModel model = new MarksheettModel();
		model.add(bean);
	}
	
	
	
	

}
