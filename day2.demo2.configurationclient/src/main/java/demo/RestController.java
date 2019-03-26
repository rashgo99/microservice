package demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Value(value = "${message:Hello default}")
	private String message;

	@GetMapping("/message")
	public String getMessage() {
		return "Current Message is : " + this.message + " " + new Date();
	}
}
