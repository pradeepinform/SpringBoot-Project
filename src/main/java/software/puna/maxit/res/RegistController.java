package software.puna.maxit.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistController {
	@Autowired
	RegBean regBean;
	@Autowired
	RegistBO registBO;
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public ModelAndView openRegst(@ModelAttribute("tt") RegBean regBean)
	{
		if(registBO.getRegistBean(regBean))
		{
			return new ModelAndView("S");
		}
		else
		{
		return new ModelAndView("E");
		}
	}
}
