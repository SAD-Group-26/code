import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private static int PSIFOS_YPER = 1;
	private static int PSIFOS_KATA = -1;
	private static Grammateia g;
	public static void main(String[] args) {
		
		//Object Creation
		ListaAitisewn listaAitisewn = ListaAitisewn.ListaAitisewn();
		ListaMelwn listaMelwn = ListaMelwn.ListaMelwn();
		ListaEisigiseon listaEisigiseon = ListaEisigiseon.listaEisigiseon();
		Melos m1 = new Melos("giannakhs@uom.edu.gr","Foinikes1314@^");
		Melos m2 = new Melos("kwstakhs@uom.edu.gr","mpananoflouda15");
		Melos m3 = new Melos("giwrgakhs@uom.edu.gr","aeraskaitympana");
		Melos m4 = new Melos("varkas@uom.edu.gr","thalassakaianemos");
		//+ allo ena melos o proedros
		
		
		Proedros proedros = Proedros.initialiseProedros("AlanTuring@uom.edu.gr", "i am the father of computer science");
	
		Ereunitis e1 = new Ereunitis("iamdarwin@uom.edu.gr","galapagos");
		Ereunitis e2 = new Ereunitis("ClaudeGGShannon@uom.edu.gr","communicatepls");
		Ereunitis e3 = new Ereunitis("sigFreud@uom.edu.gr","psycho-logy");
		
		ListaArxeion la = new ListaArxeion();
		la.prostheseArxeio("Paper.pdf");
		la.prostheseArxeio("dikaiologitika.docx");
		ListaArxeion la1 = new ListaArxeion();
		la1.prostheseArxeio("This_Paper.pdf");
		la1.prostheseArxeio("dikaiologitika.docx");
		ListaArxeion la2 = new ListaArxeion();
		la2.prostheseArxeio("psych-paper.pdf");
		la2.prostheseArxeio("dikaiologitika.docx");
		
		
		ListaArxeion la3 = new ListaArxeion();
		
		Aitisi a1 = new Aitisi(e1,"On the Origin of Species","evolutionary biology",la);
		Aitisi a2 = new Aitisi(e2,"A mathematical theory of communication","information theory",la1);
		Aitisi a3 = new Aitisi(e3,"On the Psychical Mechanism of Hysterical Phenomena","psychology",la2);
		Aitisi a4 = new Aitisi(e3,"The Neuro-Psychoses of Defence","psychology",la3);
		
		g = new Grammateia("daisecr@uom.edu.gr","uomismyhome");
		//o ereunhths prepei na ypovallei tis aithseis gia na mporei na tis dei h grammateia
		e1.ypevalleAitisi(a1);e2.ypevalleAitisi(a2);e3.ypevalleAitisi(a3);
		g.diavaseAitiseisGiaPrwtoElegxo();
		
		printScenarioMenu();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice){
			case 1:
				scenario1(a1);
				break;
			case 2:
				scenario2(a2);
				break;
			case 3:
				scenario3(a3);
				break;
			case 4:
				printKatalogous();
				break;
				
		}
		while(choice != 4) {
			printScenarioMenu();
			choice = sc.nextInt();
			switch (choice){
				case 1:
					scenario1(a1);
					break;
				case 2:
					scenario2(a2);
					break;
				case 3:
					scenario3(a3);
					break;
				case 4:
					printKatalogous();
					break;
					
			}	
		}
		
		System.out.println("------�����------");		
		
	}
	
	private static void printKatalogous() {
		try {
			ListaAitisewn listaAitisewn = ListaAitisewn.ListaAitisewn();
			ListaMelwn listaMelwn = ListaMelwn.ListaMelwn();
			ListaEisigiseon listaEisigiseon = ListaEisigiseon.listaEisigiseon();
			System.out.println("�� ����� �� ����������� ���������");
			System.out.println("����� ��������\n");
			listaAitisewn.printData();
			Thread.sleep(4000);
			System.out.println("����� ����������\n");
			listaEisigiseon.printData();
			Thread.sleep(4000);
			System.out.println("����� �����");
			listaMelwn.printData();
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void scenario3(Aitisi a) {
		//������� 3: � ������ ��� ����� ������ ��� ������������ ��� ��� ����������
		Proedros proedros = Proedros.Proedros();
		Ereunitis e = a.getEreunitis();
		try {
			System.out.println("����������� ��� ���������� �� ��������� ��� ������");
			g.aporripsiAitisis(a);
			Thread.sleep(2000);
			
			System.out.println("������ ���� � ��������� �� ��� ��� �������� ���");
			e.printAitiseis();
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private static void scenario2(Aitisi a) {
		
		//������� 2: � ������ ����� ������ ��� ������� ��������
		try {
			System.out.println("�������� ��� �������, �� ���� ��� ��� �������� ��� �������");
			Proedros proedros = Proedros.Proedros();
			ListaMelwn listaMelwn = ListaMelwn.ListaMelwn();
			Melos m1 = listaMelwn.getMeli_EHDE().get(0);
			Melos m2 = listaMelwn.getMeli_EHDE().get(1);
			Melos m3 = listaMelwn.getMeli_EHDE().get(2);
			Melos m4 = listaMelwn.getMeli_EHDE().get(3);
			Ereunitis e = a.getEreunitis();
			Thread.sleep(2000);
			
			System.out.println("���� ����������� ��� ���������� �� ������������� ��� ������.");
			Thread.sleep(2000);
			g.protokollisiAitisis(a);
			

			System.out.println("���� ����������� ���� ������ �����������.");
			Thread.sleep(2000);
			proedros.apokleismosMelous(m3, a.getEisigisi());
			System.out.println("� �������� ����� ��������� ��� �����, �� " + m1);
			Thread.sleep(2000);//m1,m2,m4 -> m1 eisigitis
			
			System.out.println("� �������� ���������� ��� ������ �����������.");
			Thread.sleep(2000);
			proedros.oloklhrwseElegxoSymferontwn(a);
			
			
			System.out.println("� �������� ���� ������ �� �������� ��������.");
			Thread.sleep(2000);
			proedros.anetheseEisigisi(m1,a);
			System.out.println("� �������� ������� ��� �������� ����: "+ m1);
			Thread.sleep(2000);
			
			System.out.println("���� ������ � ��������� �� ������ ��� ��������.");
			Thread.sleep(2000);
			m1.dimiourgiseEisigisi(a,"He is just doing maths nothing of ethics that should concern us");

			System.out.println("����� � �������� ���� ������� ���� ���������.");
			Thread.sleep(2000);
			proedros.psifiseGiaEisigisi(PSIFOS_YPER, a.getEisigisi());
			m2.psifiseGiaEisigisiAitisis(a, PSIFOS_YPER);
			m4.psifiseGiaEisigisiAitisis(a, PSIFOS_YPER);
			
			System.out.println("�������� ���� ���� ������� � �������� ��� ��������� ��� �������� �� ����������");
			Thread.sleep(2000);
			proedros.oloklhrwsePsifoforia(a);
			
			String message2 = (a.getEisigisi().getResult()) ? "Ginetai Apodekth":"Aporriptetai";
			System.out.println(a.getTitle() + " " + message2);
			System.out.println(a.getEisigisi().getResult());
			Thread.sleep(2000);
			
			System.out.println("���� ������ � �������� �� ������ ��� �������.");
			Thread.sleep(2000);
			proedros.grapseApofasi("� ������ ����� ������� �������� ���� � ������� ��������� ����� �����������", a.getApofasi());
			proedros.ypograpseApofasiAitisis(a);
			
			
			System.out.println("� �������� ��������.\n� ���������� ������ �� ���������� ��� �������� ��� ��� ����������");
			Thread.sleep(2000);
			g.enimerwseEreuniti(a);
			
			Thread.sleep(2000);
			System.out.println("���� ������ �� ��� � ��������� ��� � ������ ��� ���������� ����������");
			e.printAitiseis();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void scenario1(Aitisi a) {
		//������� 1: � ������ ����� ������ ��� ��������� ���������� ��� ��� ��������
		try {
			System.out.println("�������� ��� �������, �� ���� ��� ��� �������� ��� �������");
			Proedros proedros = Proedros.Proedros();
			ListaMelwn listaMelwn = ListaMelwn.ListaMelwn();
			Melos m1 = listaMelwn.getMeli_EHDE().get(0);
			Melos m2 = listaMelwn.getMeli_EHDE().get(1);
			Melos m3 = listaMelwn.getMeli_EHDE().get(2);
			Melos m4 = listaMelwn.getMeli_EHDE().get(3);
			Ereunitis e = a.getEreunitis();
			Thread.sleep(2000);
			
			System.out.println("���� ����������� ��� ���������� �� ������������� ��� ������.");
			g.protokollisiAitisis(a);
			Thread.sleep(2000);
			
			
			System.out.println("���� ����������� ���� ������ �����������.");
			Thread.sleep(2000);
			proedros.apokleismosMelous(m1, a.getEisigisi());//m2,m3,m4-> m2 eisigitis
			System.out.println("� �������� ����� ��������� ��� �����, �� " + m1);
			Thread.sleep(2000);
			System.out.println("� �������� ���������� ��� ������ �����������.");
			Thread.sleep(2000);
			proedros.oloklhrwseElegxoSymferontwn(a);
			
			System.out.println("� �������� ���� ������ �� �������� ��������.");
			Thread.sleep(2000);
			
			proedros.anetheseEisigisi(m2,a);
			System.out.println("� �������� ������� ��� �������� ����: "+ m2);
			Thread.sleep(2000);
			
			System.out.println("���� ������ � ��������� �� ������ ��� ��������.");
			Thread.sleep(2000);
			m2.dimiourgiseEisigisi(a, "������������ �������� ��������, �� ��� ��������?");

			System.out.println("����� � �������� ���� ������� ���� ���������.");
			Thread.sleep(2000);
			proedros.psifiseGiaEisigisi(PSIFOS_YPER, a.getEisigisi());
			m3.psifiseGiaEisigisiAitisis(a, PSIFOS_KATA);
			m4.psifiseGiaEisigisiAitisis(a, PSIFOS_KATA);
			
			System.out.println("�������� ���� ���� ������� � �������� ��� ��������� ��� �������� �� ����������");
			Thread.sleep(2000);
			proedros.oloklhrwsePsifoforia(a);
			
			String message1 = (a.getEisigisi().getResult()) ? "Ginetai Apodekth":"Aporriptetai";
			System.out.println(a.getTitle() + " " + message1);
			Thread.sleep(2000);
			
			
			System.out.println("���� ������ � �������� �� ������ ��� �������.");
			Thread.sleep(2000);
			proedros.grapseApofasi("� ������ ��� ������� �������� ����� ������� "
					+ "������ ���������, �� ����� ������� ��������� ��� ���������", a.getApofasi());
			
			System.out.println("���� ������ � �������� �� ��������� ��� �������.");
			Thread.sleep(2000);
			proedros.ypograpseApofasiAitisis(a);
			
			
			System.out.println("� �������� ��������.\n� ���������� ������ �� ���������� ��� �������� ��� ��� ����������");
			Thread.sleep(2000);
			g.enimerwseEreuniti(a);
			
			Thread.sleep(2000);
			System.out.println("���� ������ �� ��� � ��������� ��� � ������ ��� ���������� ����������");
			e.printAitiseis();
			Thread.sleep(2000);
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	private static void printScenarioMenu() {
		System.out.println("������� ��� ����");
		System.out.println("������� 1 ��� ������ ��� ����� ���������� � ���������� ��� ��� � ��������");
		System.out.println("������� 2 ��� ������ ��� ����� ���������� � ���������� ��� � ��������");
		System.out.println("������� 3 ��� ������ ��� ����� ��� ���������� � ����������(��� ������ ������)");
		System.out.println("������� 4 ��� �����, ��� �������� ���������");
	}
	
}
