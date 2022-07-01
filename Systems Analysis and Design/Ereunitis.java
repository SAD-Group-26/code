import java.util.ArrayList;

public class Ereunitis {

	private String email;
	private String password;
	private ArrayList<Aitisi> Lista_Aitisewn_Tou;
	private int votesCounter;
	public Ereunitis(String email, String password) {
		this.email=email;
		this.password = password;
		Lista_Aitisewn_Tou = new ArrayList<Aitisi>();
		votesCounter=0;
	}
	
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList getLista_Aitisewn_Tou() {
		return this.Lista_Aitisewn_Tou;
	}

	public void setLista_Aitisewn_Tou(ArrayList Lista_Aitisewn_Tou) {
		this.Lista_Aitisewn_Tou = Lista_Aitisewn_Tou;
	}
	
	public void prostheseAitisiStinListaTou(Aitisi a) {
		this.Lista_Aitisewn_Tou.add(a);
	}

	/**
	 * 
	 * @param Aitisi
	 */
	public void ypevalleAitisi(Aitisi a) {
		//prepei na einai dikh tou h aitisi me gui den tha eixame thema
		if(a.getEreunitis().equals(this)) {
			
			a.setVisibilityPhase(PhasesOfAitisi.ELEGXOS);
			//twra mporei na thn dei h grammateia
		}else {
			System.out.println("this operation is prohibited");
		}
		
		
	}
	public void editAitisi(Aitisi aitisi) {
		// TODO - implement ���������.editAitisi
		throw new UnsupportedOperationException();
	}

	public void printAitiseis() {
		// TODO - implement ���������.printAitiseis
		System.out.println(this.email+ " ��������");
		String currentMsg = "";
		for(Aitisi a: this.Lista_Aitisewn_Tou) {
			switch (a.getVisibilityPhase()) {
				case PROETOIMASIA:
					currentMsg = "��� ���� ��������� �����";
					break;
				case ELEGXOS:
					currentMsg = "���� ��������� ���� ��� ���� �������� ��� ��������� ��� ��� ����������";
				case APORRIPSH:
					currentMsg = "��� ����� �������� ����� ����� ���������";
					break;
				case ENHMERWSH_GIA_VELTIWSEIS:
					currentMsg = "��� ����� �������� ����� ���������� ����������\n";
					currentMsg+= a.getApofasi().getText();
					break;
				case ENHMERWSH_GIA_APODOXH:
					currentMsg = "� ������ ��� ����� ��������!!";
					break;
				default:
					currentMsg = "� ������ ��������� ��� ����������� ��� ��� ����";
				
					
					
			}
			System.out.println("� ������ ���:" + a);
			System.out.println("���������: " + currentMsg);
		}
	}


	
	public void printData() {
		System.out.println("Ereunitis [email=" + email + ", password=" + password + ", Lista_Aitisewn_Tou=" + Lista_Aitisewn_Tou
				+ ", votesCounter=" + votesCounter + "]");
	}
	
	

}