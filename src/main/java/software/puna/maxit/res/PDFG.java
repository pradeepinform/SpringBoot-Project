package software.puna.maxit.res;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PDFG {
	@Autowired
	RegsitDAO regsitDAO;
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistInterface distInterface;
	
	public List<CommanBean> getPDFDataFor()
	{
		List<CommanBean> l=new ArrayList<CommanBean>();
		try {
			
			List<RegistDTO> list = regsitDAO.getRegistDetail();
			
			 for(RegistDTO p:list)
			 {
				 CommanBean cbean= new CommanBean();
				 cbean.setName(p.getName());
				 cbean.setPhone(p.getPhone());
				StateDTO b = stateInterface.getStateDTOStateNameByStCode(Integer.parseInt(p.getStCode()));
				 cbean.setStName(b.getStName());
	cbean.setDistName(distInterface.getDistDTODistNameeeByDistCode(p.getDistCode()).getDistName());
				 l.add(cbean);
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return l;
	}

}
