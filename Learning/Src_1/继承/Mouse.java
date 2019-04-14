package 继承;

public class Mouse extends Animal{
	public Mouse(String myName,int myid) {
		super(myName,myid);
	}
	public void mouseEat() {
		super.eat();
	}
	public static void main(String[] args) {
		Mouse rat = new Mouse("Tom",11);
		rat.mouseEat();
	}
}