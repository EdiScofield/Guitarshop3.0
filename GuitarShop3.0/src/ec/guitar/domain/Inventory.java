/**
 * 
 */
package ec.guitar.domain;

import java.util.ArrayList;
import java.util.List;

import ec.guitar.domain.Guitar;

/**
 * �ֿ��� ����ҵ�� �� ��� ��ɾ������ѯ����
 * 
 * @author ST
 *
 */
public class Inventory
{
	private List<Guitar> guitars;

	public Inventory()
	{
		guitars = new ArrayList<Guitar>();
	}

	// ��Ӽ�������
	public void addGuitar(Guitar guitar)
	{
		guitars.add(guitar);
	}

	// ��ѯ��������
	public List<Guitar> searchGuitar()
	{
		return guitars;
	}

	// ɾ����������
	public void delGuitar(String serialNumber)
	{

	}

}
