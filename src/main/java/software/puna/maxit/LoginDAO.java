package software.puna.maxit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import software.puna.maxit.utility.EncriptClass;

@Repository
public class LoginDAO {
	@Autowired
	LoginInterfce loginInterfce;
public boolean login(LoginDto  loginDto)
{
	System.out.println("DAom "+loginDto.getUid()+" "+loginDto.getPass());
	
	LoginDto lb = loginInterfce.getLoginDtoByUid(loginDto.getUid());
	   System.out.println("db "+lb.getPass());
	  if(lb.getPass().equals(EncriptClass.getMd5(loginDto.getPass())))
	  {
		  return true;
	  }
	return false;
	
}


	
}
