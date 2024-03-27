package software.puna.maxit.res;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StateInterface extends CrudRepository<StateDTO, Integer>{
	StateDTO getStateDTOStateNameByStCode(int stCode);
}
