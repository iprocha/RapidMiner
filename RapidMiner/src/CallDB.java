import javax.swing.JOptionPane;

public class CallDB {
	
	public static String checkedInput (String message){
		String variable = null;
		while (variable == null){
			variable = JOptionPane.showInputDialog("Por favor, digite o(a) "+ message+ " desejado(a):");
			if (variable == null || variable.equals("")){
				JOptionPane.showInputDialog("É preciso digitar um(a) "+message+" para prosseguir.");
			}
		}
		return variable;
	}

	public static void main(String[] args)throws Exception { 
		DBConnection dao = new DBConnection();
		RPMReading tab02 = new RPMReading();
		
		String rpmPath = "public/tab02s.rmp";
		
		String domain = null;
		String schema = null;
		String server = null;
		String user = null;
		String password = null;
		
//Pedir parametros do banco para o usuario	
//	domain = checkedInput("domínio");
//	schema = checkedInput("banco");
//	server = checkedInput("servidor");
//	user = checkedInput("usuário");
//	password = checkedInput(password);	
	
	//Setar parametros do banco no objeto da classe DBConnection	
//	dao.setDomain(domain);
//	dao.setSchema(schema);
//	dao.setServer(server);
//	dao.setUser(user);
//	dao.setPassword(password);
		
		dao.readDataBase();
		tab02.run(rpmPath);

	}

}
