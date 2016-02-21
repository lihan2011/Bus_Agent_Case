/**   
 * @Title: BusController.java 
 * @Package core.test 
 * @Description: TODO(鐢ㄤ竴鍙ヨ瘽鎻忚堪璇ユ枃浠跺仛浠�箞) 
 * @author lihan
 * @date 2016骞�鏈�1鏃�涓嬪崍1:46:35 
 * @version V1.0   
 */ 
package core.test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wondersgroup.showcase.core.web.BaseSpringController;
import com.wondersgroup.showcase.core.web.Servlets;

import core.model.Administrator;
import core.service.AdministratorService;

/** 
 * @ClassName: BusController 
 * @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜绫荤殑浣滅敤) 
 * @author lihan
 * @date 2016骞�鏈�1鏃�涓嬪崍1:46:35 
 *  
 */
@Controller
@RequestMapping(value = "/bus/busBasicInfo")
public class BusController extends BaseSpringController{



	@Autowired
	private AdministratorService administratorservice;
	
	@RequestMapping(value = "/input", method = {RequestMethod.GET})
	@ResponseBody
	public Object input(Model model, HttpServletRequest request) {
		Map<String, Object> searchParams =Servlets.getParametersStartingWith(request, "search_");
		Administrator admin = administratorservice.selectAdministrator();
		ModelAndView mv = new ModelAndView();
		mv.addObject("admin", admin);  
		mv.setViewName("bus/bus");  
	    return mv;
	}	
}
