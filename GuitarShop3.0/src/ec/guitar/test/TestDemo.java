package ec.guitar.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ec.guitar.dao.DaoFactory;
import ec.guitar.dao.IGuitarDao;
import ec.guitar.util.MySqlDBUtil;
import ec.guitar.util.SqliteDBUtil;

/**
 * ²âÊÔ³ÌÐòÔËÐÐ
 * 
 * @author ST
 *
 */
public class TestDemo
{
	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.getConnection();
		// tester.add();
		System.out.println(conn);// ²âÊÔÁ´½Ó

		Connection conn2 = MySqlDBUtil.getConnection();
		// tester.add();
		System.out.println(conn2);// ²âÊÔÁ´½Ó

		IGuitarDao gd = DaoFactory.createGuitarDao();
		PreparedStatement pstmt = null;
		String sql1 = "INSERT INTO guitar(serialNumber,price,builder,model,type,backWood,topWood) VALUES (?,?,?,?,?,?,?)";
		try
		{
			pstmt = conn2.prepareStatement(sql1);
			pstmt.setString(1, "0007");
			pstmt.setDouble(2, 233.22);
			pstmt.setString(3, "gyt");
			pstmt.setString(4, "CJ");
			pstmt.setString(5, "acoustic");
			pstmt.setString(6, "sitka");
			pstmt.setString(7, "maple");
			if (pstmt.executeUpdate() > 0)
			{
				System.out.print("sql1 success");
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
