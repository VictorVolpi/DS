import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class Aplicacao{
   
    public static void main(String[] args) {
        
		//controla e executa uma instru�ao sql
		Statement state;
			
		//conjunto de dados retornado por uma consulta sql
		ResultSet resultset;
	
		//instancia o objeto conex da classe Conexao
		Conexao conex = new Conexao();     
	
		String sql = "select * from tbCategoria";
					
		conex.conectar();      
					
		try{                  
				
			state = (Statement) Conexao.con.createStatement();
			resultset = state.executeQuery(sql);
				
				while(resultset.next()){
					//System.out.print(" "+resultset.getString("nomeDaColuna"));
					System.out.print(" "+resultset.getString(1));
					System.out.print(" "+resultset.getString(2)+"\n");
				}                         
		}
		catch(SQLException erro){
			System.out.println("Nao foi poss�vel realizar a consulta");
		}     
			
		conex.desconectar();
    }    
}

