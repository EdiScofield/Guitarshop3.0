package ec.guitar.dao;

import java.util.List;

import ec.guitar.domain.Guitar;
import ec.guitar.domain.GuitarSpec;

/**
 * GuitarDao 数据库访问层，接口
 * 
 * @author ST
 */
public interface IGuitarDao {

	/**
	 * 添加吉他方法
	 * 
	 * @return
	 */
	public void addGuitar(Guitar guitar);

	/**
	 * 匹配/查询吉他
	 * @return
	 */
	public List<Guitar> searchGuitar();

	/**
	 * 删除数据库中对应的Guirtar，通过serialNunmber删除
	 * 
	 * @param serialNumber
	 *        序列号
	 * @return
	 */
	public void delGuitar(String serialNumber);

}
