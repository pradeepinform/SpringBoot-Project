package software.puna.maxit;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import software.puna.maxit.res.LocationDAO;
import software.puna.maxit.res.RegBean;
import software.puna.maxit.res.StateDTO;

@Controller
public class LoginControllller {
	@Autowired
	LoginBean loginBean;
	@Autowired
	LoginDAO loginDAO;
	@Autowired
	LoginDto loginDto;
	@Autowired
	LocationDAO locationDAO;
	@Autowired
	RegBean regBean;
@RequestMapping(value = "userLogin", method = RequestMethod.GET)
	
	public ModelAndView Open()
	{
		return new ModelAndView("login","t",loginBean);
	}

@RequestMapping(value = "lgin", method = RequestMethod.POST)

public ModelAndView checkLogin(@ModelAttribute("t")LoginBean loginBean)
{
	 System.out.println("in login"+loginBean.getUid() +" "+loginBean.getPass());
	 
	BeanUtils.copyProperties(loginBean, loginDto);
	
	if(loginDAO.login(loginDto))
	{
		
		return new ModelAndView("reg","tt",regBean);
	}
	return null;
}

@ModelAttribute("sttt")
public List<StateDTO> getStateList()
{
	List<StateDTO> list = locationDAO.getStateListtt();
	System.out.println("list "+list.size());
	return list;
}


}
