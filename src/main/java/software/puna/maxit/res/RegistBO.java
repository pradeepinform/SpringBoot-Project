package software.puna.maxit.res;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistBO {
	@Autowired
	RegsitDAO regsitDAO;
	@Autowired
	RegistDTO registDTO;
	public boolean getRegistBean(RegBean regBean)
	{
		BeanUtils.copyProperties(regBean, registDTO);
		
		return regsitDAO.saveData(registDTO);
		
	}
	
}
