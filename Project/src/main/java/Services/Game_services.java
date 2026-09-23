package Services;

import DAO.GameCafe_dao;
import POJO.Game_cafe;

public class Game_services {
	
	public void insertData(Game_cafe gc) throws Exception {
		
		GameCafe_dao gd=new GameCafe_dao();
		gd.insertData(gc);
	}
	
public void updateData(Game_cafe gc) throws Exception {
	GameCafe_dao gd=new GameCafe_dao();
	gd.updateData(gc);
}

public void fetchData(Game_cafe gc) throws Exception{
	GameCafe_dao gd=new GameCafe_dao();
	gd.fetchData(gc);
}
public void search(Game_cafe gc) throws Exception{
	GameCafe_dao gd=new GameCafe_dao();
	gd.searchData(gc);
}

public void deleteData(Game_cafe gc) throws Exception{
	GameCafe_dao gd=new GameCafe_dao();
	gd.deleteData(gc);
}

}
