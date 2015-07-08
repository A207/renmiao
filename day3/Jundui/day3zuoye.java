package Jundui;

interface Assaultable{
	abstract void attack();
}
interface Mobile{
	abstract void move();
}
abstract class Weapon implements Assaultable,Mobile
{
	public void attack(){
		System.out.println("����Ŀ��");
	}
	public void move(){
		System.out.println("�ƶ�");
	}
}
class Tank extends Weapon{
	public void attack(){
		System.out.println("̹�˹���Ŀ��");
	}
	public void move(){
		System.out.println("̹���ƶ�");
	}
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("�ɻ�����Ŀ��");
	}
	public void move(){
		System.out.println("�ɻ��ƶ�");
	}
}
class WarShip extends Weapon{
	public void attack(){
		System.out.println("ս������Ŀ��");
	}

}
class Army{

	private Weapon[]w=null;
	private int i=0;
	public Army(int i){
		w=new Weapon[i];
	}
	
	public void addWeapon(Weapon we){
	if(i>=w.length){
		System.out.println("�������㹻");
		return;
	}else{
		w[i]=we;
		i++;
	}
	}
	public void attackAll(){
		for(Weapon we:w){
			if(we!=null){
				we.attack();
			}
		}
	}
	public void moveAll	(){
		for(Weapon we:w){
			if(we!=null){
				we.move();
			}
		}
	}
}
public class day3zuoye {
	public static void main(String[] args) {
		Army a=new Army(3);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		//a.addWeapon(new Tank());
		a.attackAll();
		a.moveAll();
	}

}