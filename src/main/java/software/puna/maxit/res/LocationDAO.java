package software.puna.maxit.res;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDAO {
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistInterface distInterface;
	public List<StateDTO> getStateListtt()
	{
		List<StateDTO> list =(List<StateDTO>)stateInterface.findAll();
		return list;
	}
	
	public List<DistDTO> getDistList(String stCode)
	{
		List<DistDTO> list = distInterface.getDistDTOByStCode(stCode);
		  return list;
	}
	
	
}
