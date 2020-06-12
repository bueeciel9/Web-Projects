package bakery;

public class BakeryPlate {
	int breadCnt;
	int eatCnt;
	
	synchronized public void makeBread() {
		if(breadCnt > 9) {
			try {
				System.out.println("���� ���� á���ϴ�. ��������.");
				wait();
			} catch (InterruptedException e) {;}
		}
		breadCnt++;
		System.out.println("���� 1�� ��������ϴ�. �� : " + breadCnt + "��");
	}
	
	synchronized public void eatBread() {
		if(eatCnt == 20) {
			System.out.println("���� �� ���������ϴ�.");
		}else if(breadCnt < 1) {
			System.out.println("��ٸ�����.");
		}else {
			breadCnt --;
			eatCnt++;
			System.out.println("���� 1�� �Ծ����ϴ�. �� : " + breadCnt + "��");
		}
		this.notify();
	}
}








