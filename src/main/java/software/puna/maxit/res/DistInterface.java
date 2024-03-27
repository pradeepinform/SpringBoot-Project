package software.puna.maxit.res;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DistInterface extends CrudRepository<DistDTO, String>{
   List<DistDTO> getDistDTOByStCode(String stCode);
   DistDTO getDistDTODistNameeeByDistCode(String distCode);
	
}
