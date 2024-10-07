       package in.co.rays.model;
       import java.sql.Connection;
       import java.sql.PreparedStatement;
       import java.sql.ResultSet;
       import in.co.rays.bean.MarksheettBean;
       import in.co.rays.util.JDBCDataSource;
       public class MarksheettModel {
	
	    public Integer nextpk() throws Exception{
	    	
	    	int pk=0;
	    	Connection conn = JDBCDataSource.getConnection();
	    	PreparedStatement pstmt = conn.prepareStatement("select max(id) from marksheett");
	    	ResultSet rs = pstmt.executeQuery();
	    	
	    	while(rs.next())
	    	{
	    		pk = rs.getInt(1);
	    		
	    	}
	    	
	    	JDBCDataSource.closeConnection(conn);
	    	return pk+1;
	    	
	    	
	    }
	    
	      public void add(MarksheettBean bean) throws Exception
	      {
	    	int pk= nextpk();  
	    	Connection conn = JDBCDataSource.getConnection();
	    	PreparedStatement pstmt = conn.prepareStatement("insert into marksheett values(?,?,?,?,?,?)");
	    	
	    	pstmt.setInt(1,pk);  
	    	pstmt.setInt(2,bean.getRollNo());
	    	pstmt.setString(3,bean.getName());
	    	pstmt.setInt(4,bean.getPhysics());
	    	pstmt.setInt(5, bean.getChemistry());
	    	pstmt.setInt(6, bean.getMaths());
	    	
	    	int i = pstmt.executeUpdate();
	    	JDBCDataSource.closeConnection(conn);
	    	System.out.println("data inserted"+i);
	    	  
	      }
	    
         
	
	

}
