package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	public ModelAndView getCourseCost(@RequestParam("name") String name) {
		String msgTxt = null;
		ModelAndView mav = new ModelAndView();
		
		
		if(name.equals("SBMS")) {
			msgTxt = "SBMS Course 6000Rs INR";
		} else if(name.equals("JRTP")) {
			msgTxt = "JRTP Course 6000Rs INR";
		} else {
			msgTxt = "contact Admin";
		}
		
		mav.addObject("msg", msgTxt);
		mav.setViewName("courseView");
		return mav;
	}

}
