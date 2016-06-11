/**
 * 
 */
package ec.guitar.dao;

import ec.guitar.mysqlDao.MysqlGuitarDaoImpl;
import ec.guitar.sqliteDao.SqliteGuitarDaoImpl;

/**
 * Dao的工厂类在这里切换数据源
 * 
 * @author ST
 *
 */
public class DaoFactory
{

	 private static String db="sqlite";
	//private static String db = "mysql";

	public static IGuitarDao createGuitarDao()
	{
		IGuitarDao test = null;
		switch (db)
		{
		case "sqlite":
			test = new SqliteGuitarDaoImpl();
			break;
		case "mysql":
			test = new MysqlGuitarDaoImpl();
			break;
		}
		return test;

	}

}
