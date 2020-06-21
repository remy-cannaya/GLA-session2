package gla_ratrap;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mailsender {




		private final String username="remy.rmc@gmail.com";
		private final String password="mdp1234";
		private final String mail_from=username;
		private final String mail_to="lucky-lucke96@hotmail.fr";
		private final String objet;
		private final String texte;

		public String getUsername() {return username;}
		public String getPassword() {return password;}
		public String getMail_from() {return mail_from;}
		public String getMail_to() {return mail_to;}
		public String getObjet() {return objet;}
		public String getTexte() {return texte;}

		public EmailSender(String mail_to, String objet, String texte) {
			this.mail_to=mail_to;
			this.objet=objet;
			this.texte=texte;
			sendMail();

		}
		
		

		public void sendMail() {

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username, password);
						}
					});

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(mail_from));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(mail_to));
				message.setSubject(objet);
				message.setText(texte);

				Transport.send(message);

				System.out.println("Done");

			} 
			catch (MessagingException e) {

				throw new RuntimeException(e);

			}

		}

		public static void main(String[] args) {
			String[] s = {"This is an automatic mail after your new subscription to Movease \n "+ 
					"You are now free to look for shows nearby and we thank you for it.\n"};
			System.out.println(s[0]+s[1]);
		}
		
	}
