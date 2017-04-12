package com.example.training.controller;

import com.example.training.bean.TodoBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SampleController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("index");
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		TodoBean bean = new TodoBean();
		bean.setTitle("first todo");
		bean.setStaff("id001");
		bean.setDescription("this is the first todo");
		return new ModelAndView("view", "bean", bean);
	}

}
