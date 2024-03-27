package software.puna.maxit.res;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.DocumentException;

@Controller
public class ViewController {
	@Autowired
	RegsitDAO regsitDAO;
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistInterface distInterface;
	@Autowired
	PDFG DFG;
	@Autowired
	UserPDFExporter userPDFExporter;
	@RequestMapping(value = "view" , method = RequestMethod.GET)
	public ModelAndView viewDetail()
	{
		List<RegistDTO> list = regsitDAO.getRegistDetail();
		List<CommanBean> l=new ArrayList<CommanBean>();
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
		return new ModelAndView("view","comList",l);
		
		
	}
	
	
	@RequestMapping(value = "Download" , method = RequestMethod.GET)
	public ModelAndView pdfDetail(HttpServletResponse ponse) throws DocumentException, IOException
	{
		userPDFExporter.export(ponse);
		 
		return new ModelAndView("view");
		
		
	}

}
