package com.simplus.gestao.services;

import org.springframework.mail.SimpleMailMessage;

import com.simplus.gestao.domain.Cliente;
import com.simplus.gestao.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
