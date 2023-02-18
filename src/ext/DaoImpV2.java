package ext;
import Dao.IDao;

public class DaoImpV2 implements IDao {

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		System.out.println("Version web service");
		double data=12;
		return data;
	}

}
