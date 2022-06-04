package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@GetMapping("/product/{pid}/{name}")
	public ModelAndView getProductprice(@PathVariable("pid") Integer productId, @PathVariable("name") String name) {
		ModelAndView mav = new ModelAndView();
		
		String msgTxt = "";
		
		if(productId == 101) {
			
			msgTxt = "Product price: 400";
			
		} else if(productId == 102) {
			
			msgTxt = "Product price: 500";
		} else {
			msgTxt = "No product found";
		}
		
		mav.addObject("msg", msgTxt);
		mav.addObject("name", name);
		
		mav.setViewName("productView");
		
		return mav;
	}

}
