package software.puna.maxit.res;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DistController {
	@Autowired
	LocationDAO locationDAO;
	@RequestMapping(value = "dist", method = RequestMethod.GET)
	public List<DistDTO> getDistData(@RequestParam("stCode") String stCode)
	{
		List<DistDTO> list = locationDAO.getDistList(stCode);
		return list;
	}
	

}
