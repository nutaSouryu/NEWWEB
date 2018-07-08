package jp.co.gaiarai.obj;

public class Hero {
	private String name;
	private int hp;
	public Sword sword;
	static int money;
	public void attack() {}
	public void run() {
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
	public void sit(int sec) {
		this.hp +=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した！");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name+"は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void  sleep() {
		this.hp = 100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	private void die() {
		System.out.println(this.name+"は、死んでしまった！");
		System.out.println("GAMEOVER");
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		this.name = name;
	}
}
