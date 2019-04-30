package com.cc.open.tool;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Component
public class EmailTool {

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String senderMailAddress;

	@Autowired
	private TemplateEngine templateEngine;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	
	/**
	 * 发送不带附件html邮件
	 * 
	 * @param to       收件地址
	 * @param subject  主题
	 * @param context  内容参数值
	 * @param template 模板名称
	 */
	public void sendSimpleMail(List<String> to, String subject, Map<String, Object> con, String template) {
		String[] t = to.toArray(new String[to.size()]);
		MimeMessage mimeMessage = null;
		try {
			mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			// 设置发件人邮箱
			helper.setFrom(senderMailAddress);
			// 设置收件人邮箱
			helper.setTo(t);
			// 设置邮件标题
			helper.setSubject(subject);
			// 添加正文（使用thymeleaf模板）
			Context context = new Context();
			context.setVariables(con);
			String content = this.templateEngine.process(template, context);
			helper.setText(content, true);
			// 发送邮件
			javaMailSender.send(mimeMessage);
			logger.info("###### 邮件发送成功");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
