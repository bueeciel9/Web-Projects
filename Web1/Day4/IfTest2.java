package day04;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = "�縷�� ���� �����ϴ� ���� ��\n ���� ���� ���� ������ �����ϼ���.\n";
		String choiceMsg = "1.ȣ����\n2.��\n3.������\n4.��\n5.��";
		
		String answer1 = "������";
		String answer2 = "���";
		String answer3 = "�ڽ�";
		String answer4 = "����";
		String answer5 = "���";
		String errMsg = "�ٽ� �õ����ּ���";
		
		String result = "";
		
		int choice = 0;
		//Flag�� �ش� �������� ��� �۾��� �Ϸ��� �� ���� ��
		//ǥ�ø� �ϰ� ������ ���� ���
		//boolean Ȥ�� int�� ���ȴ�.
		boolean check = false;
		
		System.out.println(msg + choiceMsg);
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			result = answer1;
			break;
		case 2:
			result = answer2;
			break;
		case 3:
			result = answer3;
			break;
		case 4:
			result = answer4;
			break;
		case 5:
			result = answer5;
			break;
		default:
			result = errMsg;
			check = true;
		}
		//����ڰ� �߸� �Է��ؼ� default������ ���ٸ�
		//check�� true�̰�, !(NOT)�� �پ� false�� ����ȴ�.
		//���� �߸� �Է��ߴٸ� if���� ���� �ʴ´�.
		if(!check) {
			result = "����� " + result + "��(��) ���Ƚ��ϴ�.";
		}
		//�ϰ�ó��(�ǹ��ڵ�)
		System.out.println(result);
	}
}





