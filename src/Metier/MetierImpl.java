package Metier;

import Dao.IDao;

public class MetierImpl implements IMetier {
	private IDao dao;
	
	@Override
	public double Calcul() {
		// TODO Auto-generated method stub
		return dao.getValue()*2;
	}
	public void setdao(IDao iDao) {
		this.dao = iDao;
	}
}
