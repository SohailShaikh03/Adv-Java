package POJO;

public class Game_cafe {
	private int session_id;	
	private String customer_name;
	private int pc_no;
	private String game_name;
	private int duration;
	private float amount;
	
	public Game_cafe() {

	}

	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getPc_no() {
		return pc_no;
	}

	public void setPc_no1(int pc) {
		this.pc_no = pc_no;
	}

	public String getGame_name() {
		return game_name;
	}

	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Game_cafe [session_id=" + session_id + ", customer_name=" + customer_name + ", pc_no=" + pc_no
				+ ", game_name=" + game_name + ", duration=" + duration + ", amount=" + amount + "]";
	}

	public void setPc_no(int pc) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
