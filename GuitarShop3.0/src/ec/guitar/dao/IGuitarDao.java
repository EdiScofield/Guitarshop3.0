package ec.guitar.dao;

import java.util.List;

import ec.guitar.domain.Guitar;
import ec.guitar.domain.GuitarSpec;

/**
 * GuitarDao ���ݿ���ʲ㣬�ӿ�
 * 
 * @author ST
 */
public interface IGuitarDao {

	/**
	 * ��Ӽ�������
	 * 
	 * @return
	 */
	public void addGuitar(Guitar guitar);

	/**
	 * ƥ��/��ѯ����
	 * @return
	 */
	public List<Guitar> searchGuitar();

	/**
	 * ɾ�����ݿ��ж�Ӧ��Guirtar��ͨ��serialNunmberɾ��
	 * 
	 * @param serialNumber
	 *        ���к�
	 * @return
	 */
	public void delGuitar(String serialNumber);

}
