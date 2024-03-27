package software.puna.maxit;

import org.springframework.data.repository.CrudRepository;

public interface LoginInterfce extends CrudRepository<LoginDto, String>{
  
	LoginDto getLoginDtoByUid(String uid);
}
