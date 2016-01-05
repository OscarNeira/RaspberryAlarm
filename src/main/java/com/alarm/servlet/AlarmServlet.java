package com.alarm.servlet;

import com.alarm.controller.AlarmController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by neira on 05/01/16.
 */

@WebServlet(name = "alarmServlet", urlPatterns = "/alarm")
public class AlarmServlet extends HttpServlet {

	private final AlarmController alarm = new AlarmController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String alarm = this.alarm.turnOnAlarm();
		resp.getWriter().write(alarm);
	}
}
